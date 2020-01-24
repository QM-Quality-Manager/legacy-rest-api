const rp = require('request-promise');
const authToken = "";
const tenant = "demokommune";
const endPoint = 'https://www.qmplus.com/qmplus/rest/sync/departments';

(async () => {
  var options = {
    method: 'POST',
    uri: endPoint,
    body: {
      // authTokenKey: authToken,
      tenant: tenant,
      lastUpdated: ""
    },
    json: true
  };

  let result = await rp(options);
  console.log(JSON.stringify(result, null, 2));
})().then(() => {}).catch(err => {
  console.dir(err);
  process.exit(0);
})