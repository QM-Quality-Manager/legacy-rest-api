const Services = require('./service');
const { Department } = require('./../models/department');

/**
 * Department services, lets us list the available departments of the tenant
 */
class DepartmentService extends Services {
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
  async departments(authTokenKey, tenant, lastUpdated = "") {
    let result = await this.executeOperation("/sync/departments", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      lastUpdated:  lastUpdated
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new Department(entry);
      });
    } else {
      throw Error(`failed to list departments of tenant ${tenant}`);
    }
  }
}

module.exports = DepartmentService;