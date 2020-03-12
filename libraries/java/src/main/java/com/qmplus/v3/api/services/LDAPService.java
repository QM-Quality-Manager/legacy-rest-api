package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.LDAPSettingsRequest;
import com.qmplus.v3.api.models.request.LDAPStatusRequest;
import com.qmplus.v3.api.models.request.LDAPUserRequest;
import com.qmplus.v3.api.models.request.MessageRequest;
import com.qmplus.v3.api.models.response.*;
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
   * Retrieve LDAP status for the current tenant
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a LDAPSettingsResponse object for a successful status query.
   * @throws IOException Throws an IOException.
   */
  public LDAPStatusResponse status(
    String authTokenKey, String tenant, String clientInfo
  ) throws IOException {
    LDAPStatusRequest request = new LDAPStatusRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<LDAPStatusResponse> response
      = executeOperation(new TypeReference<ResponseWrapper<LDAPStatusResponse>>() {},"ldap/status", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }

  /**
   * Retrieve LDAP attributes for a user
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param clientInfo A text string representing information about the calling client.
   * @param username The username we are trying to look up
   * @return Returns a LDAPSettingsResponse object for a successful status query.
   * @throws IOException Throws an IOException.
   */
  public LDAPUserResponse ldapUser(
    String authTokenKey, String tenant, String clientInfo, String username
  ) throws IOException {
    LDAPUserRequest request = new LDAPUserRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setClientInfo(clientInfo != null ? clientInfo : "");
    request.setUsername(username);

    // Execute the operation
    ResponseWrapper<LDAPUserResponse> response
      = executeOperation(new TypeReference<ResponseWrapper<LDAPUserResponse>>() {},"ldap/user/ldap", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }

  /**
   * Retrieve LDAP settings for the current tenant
   * Logged in user required LDAP system roles
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a LDAPSettingsResponse object for a successful setting retrieval.
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
