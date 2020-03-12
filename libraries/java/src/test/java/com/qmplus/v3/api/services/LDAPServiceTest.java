package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.LDAPSettingsResponse;
import com.qmplus.v3.api.models.response.LoginResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;

public class LDAPServiceTest extends BaseTest {
  public LDAPServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("Retrieve the LDAP settings")
  void ldapSettings() throws IOException, ParseException {
    String endPoint = "http://localhost:8080/qmplus/rest";
    String tenant = "Arendaltest";
    String user = "qmadmin";
    String password = "SjeF432";

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
    LDAPSettingsResponse result = service
      .settings(login.getAuthTokenKey(), tenant, null);
    System.out.println();

    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }
}
