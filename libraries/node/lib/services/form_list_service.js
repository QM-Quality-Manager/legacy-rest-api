const Services = require('./service');
const Form = require('./../models/form');

/**
 * Department services, lets us list the available departments of the tenant
 */
class FormService extends Services {
  constructor(endPoint) {
    super(endPoint);
  }

  async formList(authTokenKey, tenant, userLanguageId, companyLanguageId, lastUpdated = "") {
    let result = await this.executeOperation("/sync/formList", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      userLanguageId: userLanguageId,
      companyLanguageId: companyLanguageId,
      lastUpdated: lastUpdated
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new Form(entry);
      });
    } else {
      throw Error(`failed to list users of tenant ${tenant}`);
    }
  }
}

module.exports = FormService;