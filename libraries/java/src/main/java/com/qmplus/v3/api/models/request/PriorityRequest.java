package com.qmplus.v3.api.models.request;

import com.qmplus.v3.api.models.util.RestConstants;

/**
 * PriorityRequest which needs to invoke from mobile device to send data to
 * server side.
 *
 * @author gaurav.chugh
 *
 */
public class PriorityRequest extends BaseRequest
{
  private Integer userLanguageId;

  private Integer companyLanguageId;

  private String lastUpdated;

  public Integer getUserLanguageId()
  {
    return userLanguageId;
  }

  public void setUserLanguageId(Integer userLanguageId)
  {
    this.userLanguageId = userLanguageId;
  }

  public Integer getCompanyLanguageId()
  {
    return companyLanguageId;
  }

  public void setCompanyLanguageId(Integer companyLanguageId)
  {
    this.companyLanguageId = companyLanguageId;
  }

  public String getLastUpdated()
  {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated)
  {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public void setAuthTokenKey(String authTokenKey)
  {
    if (authTokenKey == null || authTokenKey.equals(""))
    {
      authTokenKey = RestConstants.DEFAULT_AUTH_TOKEN_KEY;
    }
    this.authTokenKey = authTokenKey;
  }
}
