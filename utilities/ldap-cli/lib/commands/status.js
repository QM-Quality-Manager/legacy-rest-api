const AuthService = require('../auth_service');
const LDAPService = require('../ldap_service');
const fs = require('fs');

async function status(tenant, options) {
  // Unpack the variables
  const username = options.parent.username;
  const password = options.parent.password;
  const url = options.parent.url;

  // console.log(`username = ${username}`)
  // console.log(`password = ${password}`)
  // console.log(`url = ${url}`)
  // console.log(`tenant = ${tenant}`)

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

  if (options.parent.output) {
    fs.writeFileSync(options.parent.output, JSON.stringify(result, null, 2), 'utf8');
    console.log(`wrote out results to ${options.parent.output}`);
  } else {
    console.log(JSON.stringify(result, null, 2));
  }

  // Log out
  await authService.logout(authTokenKey, tenant, userId);
}

module.exports = status;