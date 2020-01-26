package com.qmplus.v3.api;

public class BaseTest {
  protected String tenant = "Demokommune";
  protected String username = "kristian";
  protected String password = "";
  protected String authTokenKey = "";

  public String getAuthTokenKey() {
    return authTokenKey;
  }

  public String getTenant() {
    return tenant;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
