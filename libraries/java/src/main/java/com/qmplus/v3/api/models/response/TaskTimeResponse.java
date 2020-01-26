package com.qmplus.v3.api.models.response;

import java.util.Date;

/**
 * TaskTimeResponse should give actionTime object for the action.
 *
 * THIS class will generate JSON out for TaskRequest .
 *
 * @author katerina
 *
 */
public class TaskTimeResponse
{
  private Integer userId;

  private Date dateDone;

  private double hoursUsed;


  public Integer getUserId()
  {
    return userId;
  }

  public void setUserId(Integer userId)
  {
    this.userId = userId;
  }

  public Date getDateDone()
  {
    return dateDone;
  }

  public void setDateDone(Date dateDone)
  {
    this.dateDone = dateDone;
  }

  public double getHoursUsed()
  {
    return hoursUsed;
  }

  public void setHoursUsed(double hoursUsed)
  {
    this.hoursUsed = hoursUsed;
  }


}
