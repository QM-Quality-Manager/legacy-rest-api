const Services = require('./service');
const { Language } = require('./../models/language');
const { DisplayTagName } = require('./../models/displaytagname');

/**
 * Localization Service, Covers all api endpoints related to extracting information
 * about the languages available and displayTagNames
 */
class LocalizationService extends Services {
  constructor(endPoint) {
    super(endPoint);
  }

  async languages(authTokenKey, tenant) {
    let result = await this.executeOperation("/local/languages", {
      authTokenKey: authTokenKey,
      tenant: tenant
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new Language(entry);
      });
    } else {
      throw Error(`failed to list languages of tenant ${tenant}`);
    }
  }  

  async displayTagNames(lastUpdated = "", clientInfo = "") {
    let result = await this.executeOperation("/local/displayTagNames", {
      lastUpdated: lastUpdated,
      clientInfo: clientInfo
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new DisplayTagName(entry);
      });
    } else {
      throw Error(`failed to list users of tenant ${tenant}`);
    }
  }  
}

module.exports = LocalizationService;