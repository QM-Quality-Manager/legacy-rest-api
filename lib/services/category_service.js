const Services = require('./service');
const CategoryGroup = require('../models/category_group');

class CategoryService extends Services {
  constructor(endPoint) {
    super(endPoint);
  }

  async categories(authTokenKey, tenant, userLanguageId, companyLanguageId, lastUpdated = "") {
    let result = await this.executeOperation("/sync/categories", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      userLanguageId: userLanguageId,
      companyLanguageId: companyLanguageId,
      lastUpdated: lastUpdated
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new CategoryGroup(entry);
      });
    } else {
      throw Error(`failed to list categories of tenant ${tenant}`);
    }
  }
}

module.exports = CategoryService;