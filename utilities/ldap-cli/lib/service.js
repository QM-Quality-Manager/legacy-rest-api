const rp = require('request-promise');

class BaseService {
  constructor(endPoint) {
    this.__endPoint = endPoint != null ? endPoint : 'https://www.qmplus.com/qmplus/rest';
  }

  async executeOperation(path, body) {
    var body = Object.assign({}, body);
    // console.log(`${this.__endPoint}${path}`)

    var options = {
      method: 'POST',
      uri: `${this.__endPoint}${path}`,
      body: body,
      json: true
    };

    let result = await rp(options);
    if (result.hasError == true) {
      throw result;
    } else {
      return result;
    }
  }
}

module.exports = BaseService;