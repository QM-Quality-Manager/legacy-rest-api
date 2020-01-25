const Services = require('./service');
const User = require('./../models/user');
const UserType = require('./../models/usertype');

/**
 * User services, lets us list the available users for a tenant
 */
class UserService extends Services {
  constructor(endPoint) {
    super(endPoint);
  }

  /**
   * Lists the users available for a tenant
   * 
   * @param {String} authTokenKey Authentication token
   * @param {String} tenant Tenant name
   * @param {String|Long} lastUpdated Filter by last updated (set this to "" by default)
   * @returns {Array<User>} Return a list of User objects.
   */
  async users(authTokenKey, tenant, lastUpdated = "") {
    let result = await this.executeOperation("/user/users", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      lastUpdated:  lastUpdated
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new User(entry);
      });
    } else {
      throw Error(`failed to list users of tenant ${tenant}`);
    }
  }

  /**
   * Returns the user types of the tenant
   * 
   * @param {String} authTokenKey Authentication token
   * @param {String} tenant Tenant name
   * @param {Int} userId User Id 
   * @param {Int} userLanguageId Language Id
   * @param {Int} companyLanguageId Company Language Id
   */
  async userTypes(authTokenKey, tenant, userId, userLanguageId, companyLanguageId) {
    let result = await this.executeOperation("/sync/userTypes", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      userId: userId,
      userLanguageId: userLanguageId,
      companyLanguageId: companyLanguageId
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new UserType(entry);
      });
    } else {
      throw Error(`failed to list users of tenant ${tenant}`);
    }
  }
}

module.exports = UserService;