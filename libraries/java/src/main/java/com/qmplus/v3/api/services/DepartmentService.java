package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.DepartmentHierarchyRequest;
import com.qmplus.v3.api.models.response.DepartmentHierarchyResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;
import java.util.List;

public class DepartmentService extends BaseService {
  DepartmentService() {
    super();
  }

  DepartmentService(String endPoint) {
    super(endPoint);
  }

  public List<DepartmentHierarchyResponse> departments(
      String authTokenKey, String tenant, String lastUpdated, String clientInfo
  ) throws IOException {
    DepartmentHierarchyRequest request = new DepartmentHierarchyRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setLastUpdated(lastUpdated != null ? lastUpdated : "");
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<DepartmentHierarchyResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<DepartmentHierarchyResponse>>>() {},"sync/departments", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }
}