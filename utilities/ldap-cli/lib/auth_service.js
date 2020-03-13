const BaseService = require('./service');

/**
 * Handles login and logout of a user, allowing us to get an authTokenKey to 
 * be used to call other services.
 */
class AuthService extends BaseService {
  constructor(endpoint) {
    super(endpoint);
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
      return result.content;
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
      return result.content;
    } else {
      throw Error(`failed to logout for userId ${userId}`);
    }
  }
}

module.exports = AuthService;