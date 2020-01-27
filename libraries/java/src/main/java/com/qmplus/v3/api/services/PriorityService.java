package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.CategoryRequest;
import com.qmplus.v3.api.models.response.PriorityResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;

public class PriorityService extends BaseService {
  PriorityService() {
    super();
  }

  PriorityService(String endPoint) {
    super(endPoint);
  }

  public ResponseWrapperList<PriorityResponse> priorities(
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
    ResponseWrapper<ResponseWrapperList<PriorityResponse>> response = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<PriorityResponse>>>() {},"sync/priorities", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }
}
