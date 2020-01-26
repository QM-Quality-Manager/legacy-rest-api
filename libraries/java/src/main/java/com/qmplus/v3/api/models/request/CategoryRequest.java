package com.qmplus.v3.api.models.request;

/**
 * CategoryRequest which needs to invoke from mobile device to send data to server
 * side.
 *
 * @author gaurav.chugh
 *
 */
public class CategoryRequest extends BaseRequest
{
  private Integer userLanguageId;

  private Integer companyLanguageId;

  private String lastUpdated;

  public String getLastUpdated()
  {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated)
  {
    this.lastUpdated = lastUpdated;
  }

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
}
