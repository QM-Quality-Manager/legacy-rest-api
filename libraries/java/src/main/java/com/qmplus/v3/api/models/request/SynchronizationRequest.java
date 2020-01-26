package com.qmplus.v3.api.models.request;

/**
 * SynchronizationRequest which needs to invoke from mobile device to send
 * data to server side.
 * it will carries all the data which is required on client side to perform Synchronization operation.
 *
 * @author gaurav.chugh
 *
 */

public class SynchronizationRequest extends BaseRequest
{
  /**
   * Representing syncUsers via lastSyncDate of user synchronization.
   */
  private String syncUsers;

  /**
   * Representing syncForms via lastSyncDate of form synchronization.
   */
  private String syncForms;

  /**
   * Representing syncCategories via lastSyncDate of categories synchronization.
   */
  private String syncCategories;

  /**
   * Representing syncPriorities via lastSyncDate of priorities synchronization.
   */
  private String syncPriorities;

  /**
   * Representing syncDepartments via lastSyncDate of departments synchronization.
   */
  private String syncDepartments;

  /**
   * Representing syncTasks via lastSyncDate of tasks synchronization.
   */
  private String syncTasks;

  public String getSyncTasks()
  {
    return syncTasks;
  }

  public void setSyncTasks(String syncTasks)
  {
    this.syncTasks = syncTasks;
  }

  public String getSyncUsers()
  {
    return syncUsers;
  }

  public void setSyncUsers(String syncUsers)
  {
    this.syncUsers = syncUsers;
  }

  public String getSyncForms()
  {
    return syncForms;
  }

  public void setSyncForms(String syncForms)
  {
    this.syncForms = syncForms;
  }

  public String getSyncCategories()
  {
    return syncCategories;
  }

  public void setSyncCategories(String syncCategories)
  {
    this.syncCategories = syncCategories;
  }

  public String getSyncPriorities()
  {
    return syncPriorities;
  }

  public void setSyncPriorities(String syncPriorities)
  {
    this.syncPriorities = syncPriorities;
  }

  public String getSyncDepartments()
  {
    return syncDepartments;
  }

  public void setSyncDepartments(String syncDepartments)
  {
    this.syncDepartments = syncDepartments;
  }

}
