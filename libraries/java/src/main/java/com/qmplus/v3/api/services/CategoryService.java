package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.CategoryRequest;
import com.qmplus.v3.api.models.response.CategoryGroupResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;

public class CategoryService extends BaseService {
  CategoryService() {
    super();
  }

  CategoryService(String endPoint) {
    super(endPoint);
  }

  public ResponseWrapperList<CategoryGroupResponse> categories(
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
    return response.getContent();
  }
}
