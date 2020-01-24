const rp = require('request-promise');
const authToken = "";
const tenant = "demokommune";
const endPoint = 'https://www.qmplus.com/qmplus/rest/msg/messageList';
const moment = require('moment');

(async () => {
  var start = moment("2019-01-01");
  var end = moment("2019-01-31");

  var options = {
    method: 'POST',
    uri: endPoint,
    body: {
      // authTokenKey: authToken,
      tenant: tenant,
      // fromDate: start.valueOf(),
      // toDate: end.valueOf()
      // textSearchString: "alvor"
      messageId: 1
      // lastUpdated: ""
    },
    json: true
  };

  let result = await rp(options);
  console.log(JSON.stringify(result, null, 2));
})().then(() => {}).catch(err => {
  console.dir(err);
  process.exit(0);
})