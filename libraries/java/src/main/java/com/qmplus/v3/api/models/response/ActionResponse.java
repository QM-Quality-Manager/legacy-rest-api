package com.qmplus.v3.api.models.response;

import java.util.List;

/**
 * ActionResponse should give action object of task.
 *
 * THIS class will generate JSON out for TaskRequest .
 *
 * @author gaurav.chugh
 *
 */
public class ActionResponse
{
  private Integer actionId;

  private String actionName;

  private Integer caseStatusId;

  private String caseStatus;

  private List<TaskTimeResponse> actionTimesRegistered;

  public Integer getActionId()
  {
    return actionId;
  }

  public void setActionId(Integer actionId)
  {
    this.actionId = actionId;
  }

  public String getActionName()
  {
    return actionName;
  }

  public void setActionName(String actionName)
  {
    this.actionName = actionName;
  }

  public Integer getCaseStatusId()
  {
    return caseStatusId;
  }

  public void setCaseStatusId(Integer caseStatusId)
  {
    this.caseStatusId = caseStatusId;
  }

  public String getCaseStatus()
  {
    return caseStatus;
  }

  public void setCaseStatus(String caseStatus)
  {
    this.caseStatus = caseStatus;
  }

  public List<TaskTimeResponse> getActionTimesRegistered()
  {
    return actionTimesRegistered;
  }

  public void setActionTimesRegistered(List<TaskTimeResponse> actionTimesRegistered)
  {
    this.actionTimesRegistered = actionTimesRegistered;
  }

}
