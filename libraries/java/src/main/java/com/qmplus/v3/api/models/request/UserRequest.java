package com.qmplus.v3.api.models.request;

/**
 * UserRequest which needs to invoke from mobile device to send data to server
 * side.
 *
 * @author gaurav.chugh
 *
 */
public class UserRequest extends BaseRequest
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
