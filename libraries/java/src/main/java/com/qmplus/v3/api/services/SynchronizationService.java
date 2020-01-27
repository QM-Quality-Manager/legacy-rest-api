package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.SynchronizationRequest;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.SynchronizationResponse;

import java.io.IOException;
import java.util.Date;

public class SynchronizationService extends BaseService {
  SynchronizationService() {
    super();
  }

  SynchronizationService(String endPoint) {
    super(endPoint);
  }

  public SynchronizationResponse assets(
      String authTokenKey, String tenant,
      Date syncUsers, Date syncForms, Date syncCategories,
      Date syncPriorities, Date syncDepartments, Date syncTasks,
      String clientInfo
  ) throws IOException {
    SynchronizationRequest request = new SynchronizationRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setSyncCategories(syncCategories != null ? "" + syncCategories.getTime() : "");
    request.setSyncDepartments(syncDepartments != null ? "" + syncDepartments : "");
    request.setSyncUsers(syncUsers != null ? "" + syncUsers : "");
    request.setSyncForms(syncForms != null ? "" + syncForms : "");
    request.setSyncPriorities(syncPriorities != null ? "" + syncPriorities : "");
    request.setSyncTasks(syncTasks != null ? "" + syncTasks : "");
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<SynchronizationResponse> response
        = executeOperation(new TypeReference<ResponseWrapper<SynchronizationResponse>>() {},"sync/assets", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }
}
