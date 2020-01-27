package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.CategoryRequest;
import com.qmplus.v3.api.models.response.CategoryGroupResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;
import java.util.List;

/**
 * The CategoryService lets you query the available categories for a specific tenant
 */
public class CategoryService extends BaseService {
  public CategoryService() {
    super();
  }

  public CategoryService(String endPoint) {
    super(endPoint);
  }

  /**
   * List all categories for a specific tenant.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param lastUpdated Filter by lastUpdated date.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of CategoryGroupResponse responses.
   * @throws IOException Throws an IOException.
   */
  public List<CategoryGroupResponse> categories(
      String authTokenKey, String tenant,
      Integer userLanguageId, Integer companyLanguageId,
      String lastUpdated, String clientInfo
  ) throws IOException {
    CategoryRequest request = new CategoryRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setLastUpdated(lastUpdated != null ? lastUpdated : "");
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<CategoryGroupResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<CategoryGroupResponse>>>() {},"sync/categories", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }
}
