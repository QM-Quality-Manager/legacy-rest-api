package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.SynchronizationRequest;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.SynchronizationResponse;

import java.io.IOException;
import java.util.Date;

/**
 * The SynchronizationService lets the application check if its view of the world is out of sync
 * by checking each domain against it's last synced date.
 */
public class SynchronizationService extends BaseService {
  public SynchronizationService() {
    super();
  }

  public SynchronizationService(String endPoint) {
    super(endPoint);
  }

  /**
   * Check if any of your synced data is out as of a passed in date for each of the categories
   * of items that can be synced, including users, forms, categories, priorities, departments and tasks.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param syncUsers Provide the date of the last time you synced users.
   * @param syncForms Check for Forms changes after the given date.
   * @param syncCategories Check for Categories changes after the given date.
   * @param syncPriorities Check for Priorities changes after the given date.
   * @param syncDepartments Check for Departments changes after the given date.
   * @param syncTasks Check for Tasks changes after the given date.
   * @param clientInfo A text string representing information about the calling client.
   * @return Return a SynchronizationResponse instance that represents which assets are out of date.
   * @throws IOException Throws an IOException.
   */
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
