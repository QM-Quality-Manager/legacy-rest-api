package com.qmplus.v3.api.models.request;

/**
 * UserTypeRequest which needs to invoke from mobile device to send data to
 * server side.
 *
 * @author gaurav.chugh
 *
 */
public class UserTypeRequest extends BaseRequest
{
  private Integer userId;

  private Integer userLanguageId;

  private Integer companyLanguageId;

  public Integer getUserId()
  {
    return userId;
  }

  public void setUserId(Integer userId)
  {
    this.userId = userId;
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
