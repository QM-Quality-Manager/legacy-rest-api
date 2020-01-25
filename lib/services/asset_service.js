const Services = require('./service');
const Synchronization = require('./../models/synchronization');

class AssetService extends Services {
  constructor(endPoint) {
    super(endPoint);
  }

  async assets(authTokenKey, tenant, syncUsers = "", syncForms = "", 
    syncCategories = "", syncPriorities = "", syncDepartments = "", syncTasks = "") {
    
    let result = await this.executeOperation("/sync/assets", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      syncUsers: syncUsers,
      syncForms: syncForms,
      syncCategories: syncCategories,
      syncPriorities: syncPriorities,
      syncDepartments: syncDepartments,
      syncTasks: syncTasks
    });

    if (result) {
      return new Synchronization(result.content);
    } else {
      throw Error(`failed to list priorities of tenant ${tenant}`);
    }
  }  
}

module.exports = AssetService;