package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.MessageListRequest;
import com.qmplus.v3.api.models.response.MessageResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class MessageService extends BaseService {
  MessageService() {
    super();
  }

  MessageService(String endPoint) {
    super(endPoint);
  }

  public ResponseWrapperList<MessageResponse> messageList(
      String authTokenKey, String tenant,
      Integer userLanguageId, Integer companyLanguageId,
      Query query
  ) throws IOException {
    MessageListRequest request = new MessageListRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);

    // Map the query to the request
    mapQueryToRequest(query, request);

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<MessageResponse>> response = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<MessageResponse>>>() {},"msg/messageList", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }

  public ResponseWrapper<MessageResponse> message(
      String authTokenKey, String tenant,
      Integer userLanguageId, Integer companyLanguageId, Integer messageId
  ) throws IOException {
    MessageListRequest request = new MessageListRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setMessageId(messageId);

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<MessageResponse>> response = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<MessageResponse>>>() {},"msg/messageList", toJson(request));

    // Return the content object if everything went well
    if (response.getContent().getContentList().isEmpty()) {
      return new ResponseWrapper<>(null);
    } else {
      return new ResponseWrapper<>(response.getContent().getContentList().get(0));
    }
  }

  private void mapQueryToRequest(Query query, MessageListRequest request) {
    // Map the query to the request
    if (query.categoryIdList != null) {
      request.setCategoryIdList(query.categoryIdList);
    }

    if (query.formId != null) {
      request.setFormId(query.formId);
    }

    if (query.fromDate != null) {
      request.setFromDate(query.fromDate);
    }

    if (query.toDate != null) {
      request.setToDate(query.toDate);
    }

    if (query.fromDepNr != null) {
      request.setFromDepNr(query.fromDepNr);
    }

    if (query.messageType != null) {
      request.setMessageType(query.messageType);
    }

    if (query.priority != null) {
      request.setPriority(query.priority);
    }

    if (query.statusList != null) {
      request.setStatusList(query.statusList);
    }

    if (query.textSearchString != null) {
      request.setTextSearchString(query.textSearchString);
    }
  }

  public static class Query {
    /* Get only messages registered in this time span */
    private Date fromDate;
    private Date toDate;

    private String textSearchString; // Free text search for all message text fields

    private Integer fromDepNr = 1; // Search from depNr

    private Integer formId; // Only include messages with form

    private List<Integer> categoryIdList; // Only include messages having these categories

    private Integer priority; // Only include messages with this priority

    private List<Integer> statusList; // Only include messages having these statuses

    // FAULT 1, LIST - COMMENT 2, LOG 3, RISK 4, REPORT 5
    private Integer messageType;

    public Date getFromDate() {
      return fromDate;
    }

    public void setFromDate(Date fromDate) {
      this.fromDate = fromDate;
    }

    public Date getToDate() {
      return toDate;
    }

    public void setToDate(Date toDate) {
      this.toDate = toDate;
    }

    public String getTextSearchString() {
      return textSearchString;
    }

    public void setTextSearchString(String textSearchString) {
      this.textSearchString = textSearchString;
    }

    public Integer getFromDepNr() {
      return fromDepNr;
    }

    public void setFromDepNr(Integer fromDepNr) {
      this.fromDepNr = fromDepNr;
    }

    public Integer getFormId() {
      return formId;
    }

    public void setFormId(Integer formId) {
      this.formId = formId;
    }

    public List<Integer> getCategoryIdList() {
      return categoryIdList;
    }

    public void setCategoryIdList(List<Integer> categoryIdList) {
      this.categoryIdList = categoryIdList;
    }

    public Integer getPriority() {
      return priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }

    public List<Integer> getStatusList() {
      return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
      this.statusList = statusList;
    }

    public Integer getMessageType() {
      return messageType;
    }

    public void setMessageType(Integer messageType) {
      this.messageType = messageType;
    }
  }
}

