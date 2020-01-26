package com.qmplus.v3.api.models.vo;

import java.util.Date;

/**
 * The Class VoTaskTimeRegistration.
 *
 * @author katerina
 * @version 4.0
 */
public class VoTaskTimeRegistration
{
  private Date taskDoneDate;
  private double taskTimeUsage;

  public Date getTaskDoneDate()
  {
    return taskDoneDate;
  }

  public void setTaskDoneDate(Date taskDoneDate)
  {
    this.taskDoneDate = taskDoneDate;
  }

  public double getTaskTimeUsage()
  {
    return taskTimeUsage;
  }

  public void setTaskTimeUsage(double taskTimeUsage)
  {
    this.taskTimeUsage = taskTimeUsage;
  }
}