package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.LanguageRequest;
import com.qmplus.v3.api.models.request.LocalizedRequest;
import com.qmplus.v3.api.models.response.*;

import java.io.IOException;
import java.util.List;

/**
 * The LocalizationService handles all localization functionality of the API.
 */
public class LocalizationService extends BaseService {
  public LocalizationService() {
    super();
  }

  public LocalizationService(String endPoint) {
    super(endPoint);
  }

  /**
   * Return a list of LanguageResponse entries.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of LanguageResponse responses.
   * @throws IOException Throws an IOException.
   */
  public List<LanguageResponse> languages(
      String authTokenKey, String tenant, String clientInfo
  ) throws IOException {
    LanguageRequest request = new LanguageRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<LanguageResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<LanguageResponse>>>() {},"/local/languages", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }

  public List<LocalizedResponse> displayTagNames(
      String lastUpdated, String clientInfo
  ) throws IOException {
    LocalizedRequest request = new LocalizedRequest();

    // Trigger the default random key
    request.setLastUpdated(lastUpdated != null ? lastUpdated : "");
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<LocalizedResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<LocalizedResponse>>>() {},"/local/displayTagNames", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }
}
