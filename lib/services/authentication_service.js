const Services = require('./service');
const { Login } = require('./../models/login');
const { Logout } = require('./../models/logout');

/**
 * Handles login and logout of a user, allowing us to get an authTokenKey to 
 * be used to call other services.
 */
class AuthenticationService extends Services {
  constructor(endPoint) {    
    super(endPoint);
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

module.exports = AuthenticationService;