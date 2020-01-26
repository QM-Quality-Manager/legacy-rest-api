package com.qmplus.v3.api.models.request;

import java.util.Date;
import java.util.List;

/**
 * Class to hold search parameters for a request for messages
 * A search will be done using the attributes filled out.
 */
public class MessageListRequest extends BaseRequest
{
  private Integer userLanguageId;

  private Integer companyLanguageId;

  private Integer messageId; // Only get this message

  /* Get only messages registered in this time span */
  private Date fromDate;
  private Date toDate;

  private String textSearchString; // Free text search for all message text fields

  private int fromDepNr = 1; // Search from depNr

  private int formId; // Only include messages with form

  private List<Integer> categoryIdList; // Only include messages having these categories

  private int priority; // Only include messages with this priority

  private List<Integer> statusList; // Only include messages having these statuses

  // FAULT 1, LIST - COMMENT 2, LOG 3, RISK 4, REPORT 5
  private int messageType;

  /**
   * @return the userLanguageId
   */
  public Integer getUserLanguageId()
  {
    return userLanguageId;
  }

  /**
   * @param userLanguageId the userLanguageId to set
   */
  public void setUserLanguageId(Integer userLanguageId)
  {
    this.userLanguageId = userLanguageId;
  }

  /**
   * @return the companyLanguageId
   */
  public Integer getCompanyLanguageId()
  {
    return companyLanguageId;
  }

  /**
   * @param companyLanguageId the companyLanguageId to set
   */
  public void setCompanyLanguageId(Integer companyLanguageId)
  {
    this.companyLanguageId = companyLanguageId;
  }

  /**
   * @return the messageId
   */
  public Integer getMessageId()
  {
    return messageId;
  }

  /**
   * Set the messageId search parameter
   *
   * @param messageId
   */
  public void setMessageId(Integer messageId)
  {
    this.messageId = messageId;
  }

  /**
   * @return the fromDate
   */
  public Date getFromDate()
  {
    return fromDate;
  }

  /**
   * @param fromDate the fromDate to set
   */
  public void setFromDate(Date fromDate)
  {
    this.fromDate = fromDate;
  }

  /**
   * @return the toDate
   */
  public Date getToDate()
  {
    return toDate;
  }

  /**
   * @param toDate the toDate to set
   */
  public void setToDate(Date toDate)
  {
    this.toDate = toDate;
  }

  /**
   * @return the textSearchString
   */
  public String getTextSearchString()
  {
    return textSearchString;
  }

  /**
   * @param textSearchString the textSearchString to set
   */
  public void setTextSearchString(String textSearchString)
  {
    this.textSearchString = textSearchString;
  }

  /**
   * @return the fromDepNr
   */
  public int getFromDepNr()
  {
    return fromDepNr;
  }

  /**
   * @param fromDepNr the fromDepNr to set
   */
  public void setFromDepNr(int fromDepNr)
  {
    this.fromDepNr = fromDepNr;
  }

  /**
   * @return the categoryList
   */
  public List<Integer> getCategoryList()
  {
    return categoryIdList;
  }

  /**
   * @param categoryList the categoryList to set
   */
  public void setCategoryList(List<Integer> categoryIdList)
  {
    this.categoryIdList = categoryIdList;
  }

  /**
   * @return the formId
   */
  public int getFormId()
  {
    return formId;
  }

  /**
   * @param formId the formId to set
   */
  public void setFormId(int formId)
  {
    this.formId = formId;
  }

  /**
   * @return the categoryIdList
   */
  public List<Integer> getCategoryIdList()
  {
    return categoryIdList;
  }

  /**
   * @param categoryIdList the categoryIdList to set
   */
  public void setCategoryIdList(List<Integer> categoryIdList)
  {
    this.categoryIdList = categoryIdList;
  }

  /**
   * @return the priority
   */
  public int getPriority()
  {
    return priority;
  }

  /**
   * Set the priority search parameter.
   * 1 = LOW
   * 2 = MEDIUM
   * 3 = HIGH
   *
   * @param priority
   */
  public void setPriority(int priority)
  {
    this.priority = priority;
  }

  /**
   * @return the statusList
   */
  public List<Integer> getStatusList()
  {
    return statusList;
  }

  /**
   * Set the status search parameter
   *
   * @param statusList
   */
  public void setStatusList(List<Integer> statusList)
  {
    this.statusList = statusList;
  }

  /**
   * @return the messageType
   */
  public int getMessageType()
  {
    return messageType;
  }

  /**
   * Set the message type search parameter
   * FAULT 1, LIST - COMMENT 2, LOG 3, RISK 4, REPORT 5
   *
   * @param messageType
   */
  public void setMessageType(int messageType)
  {
    this.messageType = messageType;
  }


}
