package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.LoginRequest;
import com.qmplus.v3.api.models.request.LogoutRequest;
import com.qmplus.v3.api.models.response.LoginResponse;
import com.qmplus.v3.api.models.response.LogoutResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.util.RestConstants;

import java.io.IOException;

/**
 * Handles all the Authentication services
 */
public class AuthenticationService extends BaseService {
  public AuthenticationService() {
    super();
  }

  public AuthenticationService(String endPoint) {
    super(endPoint);
  }

  /**
   * Login a user
   *
   * @param tenant The name of the tenant.
   * @param username The username.
   * @param password The users password.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a LoginResponse with all the user login details.
   * @throws IOException Throws an IOException.
   */
  public LoginResponse login(
      String tenant, String username, String password, String clientInfo
  ) throws IOException {
    LoginRequest request = new LoginRequest();

    // Trigger the default random key
    request.setAuthTokenKey(RestConstants.DEFAULT_AUTH_TOKEN_KEY);
    request.setTenant(tenant);
    request.setUsername(username);
    request.setPassword(password);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<LoginResponse> response
        = executeOperation(new TypeReference<ResponseWrapper<LoginResponse>>() {},"user/login", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }

  /**
   * Logout an existing user
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userId The user id of the user we are logging out (must match with the auth token).
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a LogoutResponse with the details of the logged out user.
   * @throws IOException Throws an IOException.
   */
  public LogoutResponse logout(
      String authTokenKey, String tenant, Integer userId, String clientInfo
  ) throws IOException {
    LogoutRequest request = new LogoutRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserId(userId);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<LogoutResponse> response
        = executeOperation(new TypeReference<ResponseWrapper<LogoutResponse>>() {},"user/logout", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }
}
