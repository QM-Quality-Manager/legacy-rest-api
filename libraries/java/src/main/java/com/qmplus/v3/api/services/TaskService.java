
package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.*;
import com.qmplus.v3.api.models.response.*;
import com.qmplus.v3.api.models.vo.VoTaskTimeRegistration;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class TaskService extends BaseService {
  TaskService() {
    super();
  }

  TaskService(String endPoint) {
    super(endPoint);
  }

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
