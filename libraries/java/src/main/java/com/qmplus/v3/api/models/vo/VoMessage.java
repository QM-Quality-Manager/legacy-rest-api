package com.qmplus.v3.api.models.vo;

import java.util.*;

/**
 * To get/set data values from/to the message view.
 *
 */

/**
 * @author Thomas
 *
 */
public class VoMessage extends VoBase
{
  private static final long serialVersionUID = 1L;

  private Integer messageId;

  private Integer registeredBy;

  private Integer formVersionId;

  private Integer registeredOnBehalf;

  private Integer registeredOn;

  private Integer priorityId;

  private Double cost;

  private Integer caseHandlerId;

  private Integer caseStatusId;

  private String textJson;

  private String registeredByUsername;

  private String caseStatusName;

  // Not sure what is the difference between the next two attributes: registered & registeredDate
  private Date registered;

  private Date registeredDate;

  private int anonymity;

  private Float latitude;

  private Float longitude;

  private Map<String, String> messagefileUpload = new HashMap<>();
  private List<VoMessageField> messageFields = new ArrayList<>(0);

  /**
   * The date of when the incident the message refers to occurred
   * On UI this field is mapped with "Event occurred on" (date picker component in apps).
   */
  private Date incidentDate;

  /**
   * stores due date. This is yet to implement in Message/Task table.
   * ON HOLD for discussion
   */
  private Date dueDate;

  public Integer getMessageId()
  {
    return messageId;
  }

  public void setMessageId(Integer messageId)
  {
    this.messageId = messageId;
  }

  public Integer getRegisteredBy()
  {
    return registeredBy;
  }

  public void setRegisteredBy(Integer registeredBy)
  {
    this.registeredBy = registeredBy;
  }

  public Integer getFormVersionId()
  {
    return formVersionId;
  }

  public void setFormVersionId(Integer formVersionId)
  {
    this.formVersionId = formVersionId;
  }

  public Integer getRegisteredOnBehalf()
  {
    return registeredOnBehalf;
  }

  public void setRegisteredOnBehalf(Integer registeredOnBehalf)
  {
    this.registeredOnBehalf = registeredOnBehalf;
  }

  public Integer getRegisteredOn()
  {
    return registeredOn;
  }

  public void setRegisteredOn(Integer registeredOn)
  {
    this.registeredOn = registeredOn;
  }

  public Date getRegistered()
  {
    return registered;
  }

  public void setRegistered(Date registered)
  {
    this.registered = registered;
  }

  public Integer getPriorityId()
  {
    return priorityId;
  }

  public void setPriorityId(Integer priorityId)
  {
    this.priorityId = priorityId;
  }

  public Double getCost()
  {
    return cost;
  }

  public void setCost(Double cost)
  {
    this.cost = cost;
  }

  public Integer getCaseHandlerId()
  {
    return caseHandlerId;
  }

  public void setCaseHandlerId(Integer caseHandlerId)
  {
    this.caseHandlerId = caseHandlerId;
  }

  public Integer getCaseStatusId()
  {
    return caseStatusId;
  }

  public void setCaseStatusId(Integer caseStatusId)
  {
    this.caseStatusId = caseStatusId;
  }

  public String getTextJson()
  {
    return textJson;
  }

  public void setTextJson(String textJson)
  {
    this.textJson = textJson;
  }

  public List<VoMessageField> getMessageFields()
  {
    return messageFields;
  }

  public void setMessageFields(List<VoMessageField> messageFields)
  {
    this.messageFields = messageFields;
  }

  public Date getIncidentDate()
  {
    return incidentDate;
  }

  public void setIncidentDate(Date incidentDate)
  {
    this.incidentDate = incidentDate;
  }

  public Date getDueDate()
  {
    return dueDate;
  }

  public void setDueDate(Date dueDate)
  {
    this.dueDate = dueDate;
  }

  public Map<String, String> getMessagefileUpload()
  {
    return messagefileUpload;
  }

  public void setMessagefileUpload(Map<String, String> messagefileUpload)
  {
    this.messagefileUpload = messagefileUpload;
  }

  public String getRegisteredByUsername()
  {
    return registeredByUsername;
  }

  public void setRegisteredByUsername(String registeredByUsername)
  {
    this.registeredByUsername = registeredByUsername;
  }

  public String getCaseStatusName()
  {
    return caseStatusName;
  }

  public void setCaseStatusName(String caseStatusName)
  {
    this.caseStatusName = caseStatusName;
  }

  public Date getRegisteredDate()
  {
    return registeredDate;
  }

  public void setRegisteredDate(Date registeredDate)
  {
    this.registeredDate = registeredDate;
  }

  /**
   * @return the anonymity
   */
  public int getAnonymity()
  {
    return anonymity;
  }

  /**
   * @param anonymity the anonymity to set
   */
  public void setAnonymity(int anonymity)
  {
    this.anonymity = anonymity;
  }

  /**
   * @return the latitude
   */
  public Float getLatitude()
  {
    return latitude;
  }

  /**
   * @param latitude the latitude to set
   */
  public void setLatitude(Float latitude)
  {
    this.latitude = latitude;
  }

  /**
   * @return the longitude
   */
  public Float getLongitude()
  {
    return longitude;
  }

  /**
   * @param longitude the longitude to set
   */
  public void setLongitude(Float longitude)
  {
    this.longitude = longitude;
  }

}
