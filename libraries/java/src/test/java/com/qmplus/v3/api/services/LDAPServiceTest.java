package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.request.LDAPStatusRequest;
import com.qmplus.v3.api.models.response.LDAPSettingsResponse;
import com.qmplus.v3.api.models.response.LDAPStatusResponse;
import com.qmplus.v3.api.models.response.LDAPUserResponse;
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

  @Test
  @DisplayName("Retrieve the LDAP status")
  void ldapStatus() throws IOException, ParseException {
    String endPoint = "http://localhost:8080/qmplus/rest";
    String tenant = "Arendaltest";
    String user = "qmadmin";
    String password = "SjeF432";

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
    LDAPStatusResponse result = service
      .status(login.getAuthTokenKey(), tenant, null);
    System.out.println();

    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }

  @Test
  @DisplayName("Retrieve the LDAP information on a user")
  void ldapUser() throws IOException, ParseException {
    String endPoint = "http://localhost:8080/qmplus/rest";
    String tenant = "Arendaltest";
    String user = "qmadmin";
    String password = "SjeF432";
    String username = "ysa";
    String token = "091ad576-5403-4502-a587-895bf029e62a";

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
//    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
//    LDAPUserResponse result = service
//      .ldapUser(login.getAuthTokenKey(), tenant, null, username);
    LDAPUserResponse result = service
      .ldapUser(token, tenant, null, username);
    System.out.println();

//    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }
}
