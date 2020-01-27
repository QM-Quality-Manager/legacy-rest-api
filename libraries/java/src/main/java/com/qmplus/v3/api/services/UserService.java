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

/**
 * The UserService represents user specific operations such as listing the users for
 * a tenant or the available user types.
 */
public class UserService extends BaseService {
  public UserService() {
    super();
  }

  public UserService(String endPoint) {
    super(endPoint);
  }

  /**
   * Retrieve the list of users
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param lastUpdated Filter by lastUpdated date.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of UserResponse instances.
   * @throws IOException Throws an IOException.
   */
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

  /**
   * Retrieve the list of UserTypes available for a tenant user.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userId The userId of the user we are retrieving user types for.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of UserTypeResponse instances.
   * @throws IOException Throws an IOException.
   */
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
