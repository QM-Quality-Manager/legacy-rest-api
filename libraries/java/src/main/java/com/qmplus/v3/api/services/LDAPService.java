package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.LDAPSettingsRequest;
import com.qmplus.v3.api.models.request.MessageRequest;
import com.qmplus.v3.api.models.response.LDAPSettingsResponse;
import com.qmplus.v3.api.models.response.MessageResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.vo.VoMessage;

import java.io.IOException;

public class LDAPService extends BaseService {

  public LDAPService() {
    super();
  }

  public LDAPService(String endPoint) {
    super(endPoint);
  }

  /**
   * Retrieve LDAP settings for the current tenant
   * Logged in user required LDAP system roles
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a MessageResponse object for a successful message creation.
   * @throws IOException Throws an IOException.
   */
  public LDAPSettingsResponse settings(
    String authTokenKey, String tenant, String clientInfo
  ) throws IOException {
    LDAPSettingsRequest request = new LDAPSettingsRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<LDAPSettingsResponse> response
      = executeOperation(new TypeReference<ResponseWrapper<LDAPSettingsResponse>>() {},"ldap/settings", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }
}
