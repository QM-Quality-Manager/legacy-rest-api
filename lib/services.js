const rp = require('request-promise');
const { Login } = require('./models/login');
const { Logout } = require('./models/logout');

class Services {
  constructor(endPoint = 'https://www.qmplus.com/qmplus/rest') {
    this.__endPoint = endPoint;
  }

  async executeOperation(path, body) {
    var body = Object.assign({}, body);
    
    var options = {
      method: 'POST',
      uri: `${this.__endPoint}${path}`,
      body: body,
      json: true
    };

    let result = await rp(options);
    
    console.log("-------------------------------------------");
    console.dir(result);

    if (result.status != 200) {
      throw result;
    } else {
      return result;
    }
  }
}

class UserService {
  constructor(endPoint = 'https://www.qmplus.com/qmplus/rest') {
    this.__endPoint = endPoint;
  }
}

class AuthenticationService extends Services {
  constructor(authTokenKey, endPoint = 'https://www.qmplus.com/qmplus/rest') {
    super(authTokenKey, endPoint);
  }

  /**
   * Log the user in
   * @param tenant The user's tenant (organization name)
   * @param username The user's username
   * @param password The user's password
   * @returns Login
   */
  async login(tenant, username, password) {
    let result = await this.executeOperation("/user/login", {
      username: username,
      password: password,
      authTokenKey: "RANDOMCODE",
      tenant: tenant,
      clientInfo: "mobile"
    });

    if (result) {
      return new Login(result.content);
    } else {
      throw Error(`failed to login in with user ${username}`);
    }
  }

  /**
   * Log the user out
   * @param userId The user's userId
   * @returns Logout
   */
  async logout(authTokenKey, tenant, userId) {
    let result = await this.executeOperation("/user/logout", {
      userId: userId,
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile"
    });

    if (result) {
      return new Logout(result.content);
    } else {
      throw Error(`failed to logout for userId ${userId}`);
    }
  }
}

module.exports = {
  AuthenticationService
}