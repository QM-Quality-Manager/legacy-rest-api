package com.qmplus.v3.api.models.request;

import com.qmplus.v3.api.models.vo.VoTaskTimeRegistration;

import java.util.Date;
import java.util.List;

/**
 * TaskDoneRequest which needs to invoke from mobile device to send data to server side.
 * it will carry all the data which is required on client side to perform task done operation.
 *
 * @author gaurav.chugh
 * @author katerina
 *
 */
public class TaskDoneRequest extends BaseRequest
{
  /**
   * Representing taskId.
   */
  private Integer taskId;

  /**
   * Representing comment in the task.
   */
  private String comment;

  private Date taskDoneDate; // when Done button was clicked

  private boolean taskDone = false; // true when Done button is pressed, false when Submit hours button is pressed

  private List<VoTaskTimeRegistration> registeredHours; // List in case we have multiple offline registrations

  public String getComment()
  {
    return comment;
  }

  public void setComment(String comment)
  {
    this.comment = comment;
  }

  public Integer getTaskId()
  {
    return taskId;
  }

  public void setTaskId(Integer taskId)
  {
    this.taskId = taskId;
  }

  public boolean isTaskDone()
  {
    return taskDone;
  }

  public void setTaskDone(boolean taskDone)
  {
    this.taskDone = taskDone;
  }

  public Date getTaskDoneDate()
  {
    return taskDoneDate;
  }

  public void setTaskDoneDate(Date taskDoneDate)
  {
    this.taskDoneDate = taskDoneDate;
  }

  public List<VoTaskTimeRegistration> getRegisteredHours()
  {
    return registeredHours;
  }

  public void setRegisteredHours(List<VoTaskTimeRegistration> registeredHours)
  {
    this.registeredHours = registeredHours;
  }

}
