package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.UserRequest;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import com.qmplus.v3.api.models.response.UserResponse;

import java.io.IOException;
import java.util.Date;

public class UserService extends BaseService {
  UserService() {
    super();
  }

  UserService(String endPoint) {
    super(endPoint);
  }

  public ResponseWrapperList<UserResponse> users(String authTokenKey, String tenant, Date lastUpdated) throws IOException {
    UserRequest request = new UserRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setLastUpdated(lastUpdated == null ? "" : "" + lastUpdated.getTime());

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<UserResponse>> response = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<UserResponse>>>() {},"user/users", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }
}
