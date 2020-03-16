const AuthService = require('../auth_service');
const LDAPService = require('../ldap_service');
const fs = require('fs');

async function user(tenant, username, options) {
  // Unpack the variables
  const user = options.parent.username;
  const password = options.parent.password;
  const url = options.parent.url;

  // console.log(`username = ${username}`)
  // console.log(`password = ${password}`)
  // console.log(`url = ${url}`)
  // console.log(`tenant = ${tenant}`)

  // Log in
  const authService = new AuthService(url);
  const loginResult = await authService.login(tenant, user, password);
  const authTokenKey = loginResult.authTokenKey;
  const userId = loginResult.userId;
  
  // Execute the status
  const ldapService = new LDAPService(url);
  const result = await ldapService.ldapUser(authTokenKey, tenant, username);

  if (options.parent.output) {
    fs.writeFileSync(options.parent.output, JSON.stringify(result, null, 2), 'utf8');
    console.log(`wrote out results to ${options.parent.output}`);
  } else {
    console.log(JSON.stringify(result, null, 2));
  }

  // Log out
  await authService.logout(authTokenKey, tenant, userId);
}

module.exports = user;