package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.qmplus.v3.api.models.request.ImageUploaderRequest;
import com.qmplus.v3.api.models.request.MessageListRequest;
import com.qmplus.v3.api.models.request.MessageRequest;
import com.qmplus.v3.api.models.response.ImageResponse;
import com.qmplus.v3.api.models.response.MessageResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import com.qmplus.v3.api.models.vo.VoMessage;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * The MessageService handles all functionality associated with messages.
 */
public class MessageService extends BaseService {
  public MessageService() {
    super();
  }

  public MessageService(String endPoint) {
    super(endPoint);
  }

  /**
   * Returns a list of MessageResponse entries.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param query An object that represents the available query options for the messageList endpoint.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a list of MessageResponse entries.
   * @throws IOException Throws an IOException.
   */
  public List<MessageResponse> messageList(
      String authTokenKey, String tenant,
      Integer userLanguageId, Integer companyLanguageId,
      Query query, String clientInfo
  ) throws IOException {
    MessageListRequest request = new MessageListRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Map the query to the request
    mapQueryToRequest(query, request);

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<MessageResponse>> response = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<MessageResponse>>>() {},"msg/messageList", toJson(request));

    // Return the content object if everything went well
    return response.getContent().getContentList();
  }

  /**
   * Return a specific message.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param userLanguageId The user language id for the query (languages can be gotten from the LocalizationService).
   * @param companyLanguageId The company language id for the query (languages can be gotten from the LocalizationService).
   * @param messageId The Id of the message you want to fetch.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns the matching MessageResponse entry.
   * @throws IOException Throws an IOException.
   */
  public MessageResponse message(
      String authTokenKey, String tenant,
      Integer userLanguageId, Integer companyLanguageId,
      Integer messageId, String clientInfo
  ) throws IOException {
    MessageListRequest request = new MessageListRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setUserLanguageId(userLanguageId);
    request.setCompanyLanguageId(companyLanguageId);
    request.setMessageId(messageId);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ResponseWrapperList<MessageResponse>> response = executeOperation(new TypeReference<ResponseWrapper<ResponseWrapperList<MessageResponse>>>() {},"msg/messageList", toJson(request));

    // Return the content object if everything went well
    if (response.getContent().getContentList().isEmpty()) {
      return null;
    } else {
      return response.getContent().getContentList().get(0);
    }
  }

  /**
   * Create a new message.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param voMessage The VoMessage instance represents a new message object.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns a MessageResponse object for a successful message creation.
   * @throws IOException Throws an IOException.
   */
  public MessageResponse save(
      String authTokenKey, String tenant,
      VoMessage voMessage, String clientInfo
  ) throws IOException {
    MessageRequest request = new MessageRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setVoMessage(voMessage);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<MessageResponse> response
        = executeOperation(new TypeReference<ResponseWrapper<MessageResponse>>() {},"msg/save", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
  }

  /**
   * Upload an image to an existing message.
   *
   * @param authTokenKey The auth token of the user we are going to log out.
   * @param tenant The name of the tenant.
   * @param messageId The Id of the message you want to fetch.
   * @param fileName The name of the file we are uploading.
   * @param fileArr A BASE64 encoded string that represents the binary data.
   * @param clientInfo A text string representing information about the calling client.
   * @return Returns an ImageResponse entity on a successful upload of an image.
   * @throws IOException Throws an IOException.
   */
  public ImageResponse uploadImage(
      String authTokenKey, String tenant,
      Integer messageId, String fileName, String fileArr,
      String clientInfo
  ) throws IOException {
    ImageUploaderRequest request = new ImageUploaderRequest();

    // Trigger the default random key
    request.setAuthTokenKey(authTokenKey);
    request.setTenant(tenant);
    request.setMessageId(messageId);
    request.setFileName(fileName);
    request.setFileArr(fileArr);
    request.setClientInfo(clientInfo != null ? clientInfo : "");

    // Execute the operation
    ResponseWrapper<ImageResponse> response
        = executeOperation(new TypeReference<ResponseWrapper<ImageResponse>>() {},"msg/uploadImage", toJson(request));

    // Return the content object if everything went well
    return response.getContent();
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

  /**
   * Represents a set of Query filters to be applied to the messageList queries.
   */
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

