package com.qmplus.v3.api.models.response;

/**
 * SynchronizationResponse should give status for department,form,priority and category.
 * is there anything update in such things or not.
 *
 * THIS class will generate JSON out for SynchronizationRequest .
 *
 * @author gaurav.chugh
 *
 */
public class SynchronizationResponse
{
  private boolean statusUsers;

  private boolean statusForms;

  private boolean statusCategories;

  private boolean statusPriorities;

  private boolean statusDepartments;

  private boolean statusTasks;

  public boolean isStatusUsers()
  {
    return statusUsers;
  }

  public void setStatusUsers(boolean statusUsers)
  {
    this.statusUsers = statusUsers;
  }

  public boolean isStatusForms()
  {
    return statusForms;
  }

  public void setStatusForms(boolean statusForms)
  {
    this.statusForms = statusForms;
  }

  public boolean isStatusCategories()
  {
    return statusCategories;
  }

  public void setStatusCategories(boolean statusCategories)
  {
    this.statusCategories = statusCategories;
  }

  public boolean isStatusPriorities()
  {
    return statusPriorities;
  }

  public void setStatusPriorities(boolean statusPriorities)
  {
    this.statusPriorities = statusPriorities;
  }

  public boolean isStatusDepartments()
  {
    return statusDepartments;
  }

  public void setStatusDepartments(boolean statusDepartments)
  {
    this.statusDepartments = statusDepartments;
  }

  public boolean isStatusTasks()
  {
    return statusTasks;
  }

  public void setStatusTasks(boolean statusTasks)
  {
    this.statusTasks = statusTasks;
  }

}
