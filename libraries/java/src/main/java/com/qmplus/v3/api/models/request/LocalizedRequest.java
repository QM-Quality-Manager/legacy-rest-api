package com.qmplus.v3.api.models.request;

/**
 * LocalizedRequest which needs to invoke from mobile device to send data to
 * server side.
 *
 * @author gaurav.chugh
 *
 */
public class LocalizedRequest
{
  private String lastUpdated;

  protected String clientInfo;

  public String getLastUpdated()
  {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated)
  {
    this.lastUpdated = lastUpdated;
  }

  public String getClientInfo()
  {
    return clientInfo != null ? clientInfo : "";
  }

  public void setClientInfo(String clientInfo)
  {
    this.clientInfo = clientInfo;
  }
}
