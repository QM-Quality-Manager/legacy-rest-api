
package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.*;
import com.qmplus.v3.api.models.response.*;
import com.qmplus.v3.api.models.vo.VoTaskTimeRegistration;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * The TaskService lets us list tasks available and mark specific tasks as done.
 */
public class TaskService extends BaseService {
  public TaskService() {
    super();
  }

  public TaskService(String endPoint) {
    super(endPoint);
  }

  /**
   * List the tasks available.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of TaskResponse entries.
   * @throws IOException Throws an IOException.
   */
  public List<TaskResponse> taskList(
      String authTokenKey, String tenant,
      Integer userLanguageId, Integer companyLanguageId,
      String clientInfo
  ) throws IOException {
    TaskRequest request = new TaskRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<TaskResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<TaskResponse>>>() {},"task/taskList", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }

  /**
   * Return a specific task by its taskId.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param taskId The id of the task to retrieve.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a TaskResponse instance.
   * @throws IOException Throws an IOException.
   */
  public TaskResponse task(
      String authTokenKey, String tenant, Integer taskId,
      Integer userLanguageId, Integer companyLanguageId,
      String clientInfo
  ) throws IOException {
    TaskRequest request = new TaskRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setTaskId(taskId);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<TaskResponse>> response
        = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<TaskResponse>>>() {},"task/taskList", toJson(request));

    // Return the content object if everything went well
    if (response.getContent().getContentList().isEmpty()) {
      return null;
    } else {
      return response.getContent().getContentList().get(0);
    }
  }

  /**
   * Mark a specific task as done.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param taskId The id of the task to retrieve.
   * @param comment Store a comment on the task when marking it as done.
   * @param taskDoneDate The date the task was done.
   * @param taskDone A Boolean marking if the task was done.
   * @param registeredHours A set of registered hours against the task.
   * @param clientInfo A text string representing information about the calling client.
   * @return Return a TaskResponse instance for a successful marking of a task as done.
   * @throws IOException Throws an IOException.
   */
  public TaskResponse done(
      String authTokenKey, String tenant,
      Integer taskId, String comment, Date taskDoneDate, Boolean taskDone,
      List<VoTaskTimeRegistration> registeredHours, String clientInfo
  ) throws IOException {
    TaskDoneRequest request = new TaskDoneRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setTaskId(taskId);
    request.setComment(comment);
    request.setTaskDone(taskDone);
    request.setTaskDoneDate(taskDoneDate);
    request.setRegisteredHours(registeredHours);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<TaskResponse> response
        = executeOperation(new TypeReference<ResponseWrapper<TaskResponse>>() {},"task/done", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }
}
