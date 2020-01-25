const Services = require('./service');
const Priority = require('./../models/form/priority');

class PriorityService extends Services {
  constructor(endPoint) {
    super(endPoint);
  }

  async priorities(authTokenKey, tenant, userLanguageId, companyLanguageId, lastUpdated = "") {
    let result = await this.executeOperation("/sync/priorities", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      userLanguageId: userLanguageId,
      companyLanguageId: companyLanguageId,
      lastUpdated: lastUpdated
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new Priority(entry);
      });
    } else {
      throw Error(`failed to list priorities of tenant ${tenant}`);
    }
  }  
}

module.exports = PriorityService;