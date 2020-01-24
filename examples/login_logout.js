const { AuthenticationService } = require('../lib/services');

const endPoint = "http://localhost:8080/qmplus/rest";
const tenant = "Demokommune";
const username = "kristian";
const password = "<your password>";

(async () => {
  let authenticationService = new AuthenticationService(endPoint);
  let loginResult = await authenticationService.login(tenant, username, password);
  let sessionAuthTokenKey = loginResult.authTokenKey;

  console.dir(loginResult)
  let logoutResult = await authenticationService.logout(sessionAuthTokenKey, tenant, loginResult.userId);
  console.dir(logoutResult)
  // var options = {
  //   method: 'POST',
  //   uri: endPoint,
  //   body: {
  //     authTokenKey: authToken,
  //     tenant: tenant
  //   },
  //   json: true
  // };

  // let result = await rp(options);
  // console.log(JSON.stringify(result, null, 2));
})().then(() => {}).catch(err => {
  console.dir(err);
  process.exit(0);
})