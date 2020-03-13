const program = require('commander');
const AuthService = require('./lib/auth_service');
const LDAPService = require('./lib/ldap_service');
const fs = require('fs');

(async () => {
  program
    .version('0.0.1')
    .requiredOption('-u, --username <username>', 'provide a username with LDAP permissions')
    .requiredOption('-p, --password <password>', 'provide a password with LDAP permissions')
    .option('-l, --url <url>', 'override end point', 'https://www.qmplus.com/qmplus/rest')
    .option('-o, --output <file>', 'write output to file');

  // Add the status command
  program
    .command('status <tenant>')
    .description('Retrieve the LDAP status of a tenant')
    .action(async (tenant, options) => {
      // Unpack the variables
      const username = program.username;
      const password = program.password;
      const url = program.url;

      console.log(`username = ${username}`)
      console.log(`password = ${password}`)
      console.log(`url = ${url}`)
      console.log(`tenant = ${tenant}`)

      // Log in
      const authService = new AuthService(url);
      const loginResult = await authService.login(tenant, username, password);
      const authTokenKey = loginResult.authTokenKey;
      const userId = loginResult.userId;
      
      // Execute the status
      const ldapService = new LDAPService(url);
      const result = await ldapService.status(authTokenKey, tenant);
      result.lastSynchronizedDate = new Date(result.lastSynchronizedDate);
      result.departmentStatuses.forEach(entry => {
        entry.updated = new Date(entry.updated);
      });

      if (program.output) {
        fs.writeFileSync(program.output, JSON.stringify(result, null, 2), 'utf8');
        console.log(`wrote out results to ${program.output}`);
      } else {
        console.log(JSON.stringify(result, null, 2));
      }

      // Log out
      await authService.logout(authTokenKey, tenant, userId);
    })
    ;

  await program.parseAsync(process.argv);
})().then(() => {}).catch(err => console.error(err));
