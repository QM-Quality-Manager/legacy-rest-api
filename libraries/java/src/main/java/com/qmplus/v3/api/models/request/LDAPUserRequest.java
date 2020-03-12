package com.qmplus.v3.api.models.request;

public class LDAPUserRequest extends BaseRequest {
  private String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
