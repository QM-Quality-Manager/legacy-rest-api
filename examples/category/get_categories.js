const { CategoryService } = require('../../lib/services');
const fs = require('fs');

// const endPoint = "http://localhost:8080/qmplus/rest";
const endPoint = null;

// {
//   "authTokenKey": "<your token>",
//   "tenant": "<tenant db>",
//   "username": "<your username>"
//   "password": "<your password>"
// }
// Read the token
const token = JSON.parse(fs.readFileSync(`${__dirname}/../../token.json`, `utf8`));
const authTokenKey = token.authTokenKey;
const tenant = token.tenant;
const languageId = token.languageId;

(async () => {
  // Create user service
  let service = new CategoryService(endPoint);
  // Execute the service
  let result = await service.categories(authTokenKey, tenant, languageId, languageId, "");
  // Print the returned results
  console.log(JSON.stringify(result, null, 2))
})().then(() => {}).catch(err => {
  console.dir(err);
  process.exit(0);
})