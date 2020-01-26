package com.qmplus.v3.api.models.request;

/**
 * TaskRequest which needs to invoke from mobile device to send data to server
 * side.
 *
 * @author gaurav.chugh
 *
 */
public class TaskRequest extends BaseRequest
{

  private Integer userLanguageId;

  private Integer companyLanguageId;

  private String lastUpdated;

  private Integer taskId;

  public Integer getTaskId()
  {
    return taskId;
  }

  public void setTaskId(Integer taskId)
  {
    this.taskId = taskId;
  }

  public Integer getUserLanguageId()
  {
    return userLanguageId;
  }

  public void setUserLanguageId(Integer userLanguageId)
  {
    this.userLanguageId = userLanguageId;
  }

  public Integer getCompanyLanguageId()
  {
    return companyLanguageId;
  }

  public void setCompanyLanguageId(Integer companyLanguageId)
  {
    this.companyLanguageId = companyLanguageId;
  }

  public String getLastUpdated()
  {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated)
  {
    this.lastUpdated = lastUpdated;
  }

}
