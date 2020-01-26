package com.qmplus.v3.api.models.request;

/**
 * DepartmentHierarchyRequest which needs to invoke from mobile device to send
 * data to server side.
 *
 * @author gaurav.chugh
 *
 */

public class DepartmentHierarchyRequest extends BaseRequest
{
  private String lastUpdated;

  public String getLastUpdated()
  {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated)
  {
    this.lastUpdated = lastUpdated;
  }

}
