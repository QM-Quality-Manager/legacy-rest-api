package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.LoginRequest;
import com.qmplus.v3.api.models.response.LoginResponse;
import com.qmplus.v3.api.models.response.LogoutResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.util.RestConstants;

import java.io.IOException;

public class AuthenticationService extends BaseService {
  AuthenticationService() {
    super();
  }

  AuthenticationService(String endPoint) {
    super(endPoint);
  }

  LoginResponse login(String tenant, String username, String password) throws IOException {
    LoginRequest request = new LoginRequest();

    // Trigger the default random key
    request.setAuthTokenKey(RestConstants.DEFAULT_AUTH_TOKEN_KEY);
    request.setTenant(tenant);
    request.setUsername(username);
    request.setPassword(password);

    // Execute the operation
    ResponseWrapper<LoginResponse> response
        = executeOperation(new TypeReference<ResponseWrapper<LoginResponse>>() {},"user/login", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }

  LogoutResponse logout(String authTokenKey, String tenant, String userId) {
    return null;
  }
}
