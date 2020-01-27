package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.UserRequest;
import com.qmplus.v3.api.models.request.UserTypeRequest;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import com.qmplus.v3.api.models.response.UserResponse;
import com.qmplus.v3.api.models.response.UserTypeResponse;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class UserService extends BaseService {
  UserService() {
    super();
  }

  UserService(String endPoint) {
    super(endPoint);
  }

  public List<UserResponse> users(
      String authTokenKey, String tenant, Date lastUpdated, String clientInfo
  ) throws IOException {
    UserRequest request = new UserRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setLastUpdated(lastUpdated == null ? "" : "" + lastUpdated.getTime());
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<UserResponse>> response = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<UserResponse>>>() {},"user/users", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }

  public List<UserTypeResponse> userTypes(
      String authTokenKey, String tenant, String userId,
      Integer userLanguageId, Integer companyLanguageId,
      String clientInfo
  ) throws IOException {
    UserTypeRequest request = new UserTypeRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<UserTypeResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<UserTypeResponse>>>() {},"user/users", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }
}
