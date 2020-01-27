package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.LoginResponse;
import com.qmplus.v3.api.models.response.LogoutResponse;
import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class AuthenticationServiceTest extends BaseTest {
  public AuthenticationServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("Correctly login")
  void login() throws IOException {
    AuthenticationService service = new AuthenticationService();
    LoginResponse login = service.login(getTenant(), getUsername(), getPassword(), null);
    System.out.println();
  }

  @Test
  @DisplayName("Correctly login and logout")
  void logout() throws IOException {
    AuthenticationService service = new AuthenticationService();
    LoginResponse login = service.login(getTenant(), getUsername(), getPassword(), null);
    System.out.println();

    LogoutResponse logout = service.logout(login.getAuthTokenKey(), login.getTenantName(), login.getUserId(), null);
    System.out.println();
  }
}