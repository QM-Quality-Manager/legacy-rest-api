package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.CategoryRequest;
import com.qmplus.v3.api.models.response.PriorityResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;
import java.util.List;

/**
 * The PriorityService allows to retrieve all priority objects for a tenant.
 */
public class PriorityService extends BaseService {
  public PriorityService() {
    super();
  }

  public PriorityService(String endPoint) {
    super(endPoint);
  }

  /**
   * List all available priority objects for a specific tenant.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param lastUpdated Filter by lastUpdated date.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of PriorityResponse entries.
   * @throws IOException Throws an IOException.
   */
  public List<PriorityResponse> priorities(
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
    ResponseWrapper<ResponseWrapperList<PriorityResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<PriorityResponse>>>() {},"sync/priorities", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }
}
