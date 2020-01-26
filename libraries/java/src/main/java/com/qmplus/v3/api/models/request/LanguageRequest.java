package com.qmplus.v3.api.models.request;

import com.qmplus.v3.api.models.util.RestConstants;

/**
 * LanguageRequest which needs to invoke from mobile device to send data to
 * server side.
 *
 * @author gaurav.chugh
 *
 */
public class LanguageRequest extends BaseRequest
{
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
