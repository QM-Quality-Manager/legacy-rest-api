const Services = require('./service');
const Message = require('./../models/message');

class MessageService extends Services {
  constructor(endPoint) {
    super(endPoint);
  }

  async save(authTokenKey, tenant, voMessage) {
    let result = await this.executeOperation("/msg/save", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      voMessage: voMessage
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new Priority(entry);
      });
    } else {
      throw Error(`failed to create a new message for tenant ${tenant}`);
    }
  }  

  /**
   * Upload an image to an existing message
   * 
   * @param {String} authTokenKey Authorization token
   * @param {String} tenant Tenant name
   * @param {Integer} messageId The id of the message
   * @param {String} fileName The name for the file
   * @param {String} fileArr The BASE64 encoded binary file
   */
  async uploadImage(authTokenKey, tenant, messageId, fileName, fileArr) {
    let result = await this.executeOperation("/msg/uploadImage", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      messageId: messageId,
      fileName: fileName,
      fileArr: fileArr
    });

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new Priority(entry);
      });
    } else {
      throw Error(`failed to upload image to message ${messageId} for tenant ${tenant}`);
    }
  }  

  async messageList(authTokenKey, tenant, messageListQuery) {
    let result = await this.executeOperation("/msg/messageList", Object.assign({
      authTokenKey: authTokenKey,
      tenant: tenant
    }, messageListQuery));

    if (result) {
      let entries = result.content.contentList || [];
      return entries.map(entry => {
        return new Priority(entry);
      });
    } else {
      throw Error(`failed to list messages for tenant ${tenant}`);
    }
  }  
}

module.exports = MessageService;