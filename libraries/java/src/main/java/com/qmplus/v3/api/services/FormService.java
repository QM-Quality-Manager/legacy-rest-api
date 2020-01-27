package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.FormRequest;
import com.qmplus.v3.api.models.response.FormResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;
import java.util.List;

/**
 * Returns all defined forms
 */
public class FormService extends BaseService {
  public FormService() {
    super();
  }

  public FormService(String endPoint) {
    super(endPoint);
  }

  /**
   * Returns a list of FormResponse's
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param lastUpdated Filter by lastUpdated date.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of FormResponse responses.
   * @throws IOException Throws an IOException.
   */
  public List<FormResponse> formList(
      String authTokenKey, String tenant,
      Integer userLanguageId, Integer companyLanguageId,
      String lastUpdated, String clientInfo
  ) throws IOException {
    FormRequest request = new FormRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setLastUpdated(lastUpdated != null ? lastUpdated : "");
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<FormResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<FormResponse>>>() {},"sync/formList", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }
}
