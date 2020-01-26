package com.qmplus.v3.api.models.request;

/**
 * @author gaurav.chugh
 *
 */
public class LogoutRequest extends BaseRequest
{
  private int userId;

  public int getUserId()
  {
    return userId;
  }

  public void setUserId(int userId)
  {
    this.userId = userId;
  }

}
