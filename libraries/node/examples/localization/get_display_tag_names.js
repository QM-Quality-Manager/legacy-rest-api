const { LocalizationService } = require('../../lib/services');
const fs = require('fs');

const endPoint = "http://localhost:8080/qmplus/rest";
// const endPoint = null;

(async () => {
  // Create user service
  let service = new LocalizationService(endPoint);
  // Execute the service
  let result = await service.displayTagNames("", "mobile");
  // Print the returned results
  console.log(JSON.stringify(result, null, 2))
})().then(() => {}).catch(err => {
  console.dir(err);
  process.exit(0);
})