package com.qmplus.v3.api.models.request;

import com.qmplus.v3.api.models.util.RestConstants;

/**
 * Login request which needs to invoke from mobile device to send data to server
 * side. LoginRequest will hold all the fields which needs to send to make any
 * request from client side.
 *
 * @author vipul.vohra
 * @author gaurav.chugh
 */
public class LoginRequest extends BaseRequest {
  private String username;

  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setAuthTokenKey(String authTokenKey) {
    this.authTokenKey = authTokenKey;
  }
}
