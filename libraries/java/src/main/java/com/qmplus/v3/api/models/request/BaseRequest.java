package com.qmplus.v3.api.models.request;

/**
 * BaseRequest will have all the parameter which is common to all request.
 * IMPORTANT: all the request which can run individually needs to extend
 * BaseRequest request
 *
 * @author vipul.vohra
 * @author gaurav.chugh
 *
 */
public abstract class BaseRequest
{
  /**
   * tenant field is mandatory to setup multitenancy to check which is
   * candidate tenant to point target database
   */
  private String tenant;

  /**
   * Representing authTokenKey for authentication.
   */
  protected String authTokenKey;

  protected String clientInfo;

  public String getTenant()
  {
    return tenant;
  }

  public void setTenant(String tenant)
  {
    this.tenant = tenant;
  }

  public String getAuthTokenKey()
  {
    return authTokenKey;
  }

  public void setAuthTokenKey(String authTokenKey)
  {
    this.authTokenKey = authTokenKey;
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
