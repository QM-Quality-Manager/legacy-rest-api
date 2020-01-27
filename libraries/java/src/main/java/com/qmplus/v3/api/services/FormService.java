package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.FormRequest;
import com.qmplus.v3.api.models.response.FormResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;
import java.util.List;

public class FormService extends BaseService {
  FormService() {
    super();
  }

  FormService(String endPoint) {
    super(endPoint);
  }

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
