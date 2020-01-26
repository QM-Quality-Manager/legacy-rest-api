package com.qmplus.v3.api.models.response;

import java.util.Date;

/**
 * TaskResponse should give list of task.
 *
 * THIS class will generate JSON out for TaskRequest .
 *
 * @author gaurav.chugh
 *
 */
public class TaskResponse
{
  private Integer taskId;

  private ActionResponse action;

  private Integer state;

  private Date dueDate;

  private String description;

  private String color;

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getColor()
  {
    return color;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public Integer getTaskId()
  {
    return taskId;
  }

  public void setTaskId(Integer taskId)
  {
    this.taskId = taskId;
  }

  public ActionResponse getAction()
  {
    return action;
  }

  public void setAction(ActionResponse action)
  {
    this.action = action;
  }

  public Integer getState()
  {
    return state;
  }

  public void setState(Integer state)
  {
    this.state = state;
  }

  public Date getDueDate()
  {
    return dueDate;
  }

  public void setDueDate(Date dueDate)
  {
    this.dueDate = dueDate;
  }

}
