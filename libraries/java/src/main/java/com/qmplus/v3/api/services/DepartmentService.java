package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.DepartmentHierarchyRequest;
import com.qmplus.v3.api.models.response.DepartmentHierarchyResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;
import java.util.List;

/**
 * The DepartmentService lets you query for all the departments available
 */
public class DepartmentService extends BaseService {
  public DepartmentService() {
    super();
  }

  public DepartmentService(String endPoint) {
    super(endPoint);
  }

  /**
   * List all departments available for specific tenant.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param lastUpdated Filter by lastUpdated date.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of DepartmentHierarchyResponse entries.
   * @throws IOException Throws an IOException.
   */
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