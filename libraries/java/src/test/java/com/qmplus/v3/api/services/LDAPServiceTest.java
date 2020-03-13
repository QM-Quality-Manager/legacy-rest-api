package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;

public class LDAPServiceTest extends BaseTest {
  String endPoint = "http://localhost:8080/qmplus/rest";

  public LDAPServiceTest() throws IOException {
    super();

    // Create properties file and load the resource
    Properties properties = new Properties();
    properties.load(getClass().getClassLoader().getResourceAsStream("./ldapcredentials.properties"));

    // Read the entries
    this.tenant = properties.getProperty("tenant");
    this.username = properties.getProperty("username");
    this.userId = Integer.parseInt(properties.getProperty("userId"));
    this.password = properties.getProperty("password");
    this.authTokenKey = properties.getProperty("authTokenKey");
    this.languageId = Integer.parseInt(properties.getProperty("languageId"));
  }

  @Test
  @DisplayName("Retrieve the LDAP settings")
  void ldapSettings() throws IOException, ParseException {
    LDAPService service = new LDAPService(endPoint);
    LDAPSettingsResponse result = service
      .settings(authTokenKey, tenant, null);

    jsonToConsole(result);
  }

  @Test
  @DisplayName("Retrieve the LDAP status")
  void ldapStatus() throws IOException, ParseException {
    LDAPService service = new LDAPService(endPoint);
    LDAPStatusResponse result = service
      .status(authTokenKey, tenant, null);

    jsonToConsole(result);
  }

  @Test
  @DisplayName("Retrieve the LDAP information on a user")
  void ldapUser() throws IOException, ParseException {
    String username = "ysa";

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
//    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
//    LDAPUserResponse result = service
//      .ldapUser(login.getAuthTokenKey(), tenant, null, username);
    LDAPUserResponse result = service
      .ldapUser(authTokenKey, tenant, null, username);

    jsonToConsole(result);

//    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }

  @Test
  @DisplayName("Retrieve the LDAP information of a department by id")
  void ldapDepartmentInfoById() throws IOException, ParseException {
    Integer departmentId = 2851;

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
//    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
    LDAPDepartmentInfoResponse result = service
      .departmentInfoById(authTokenKey, tenant, null, departmentId);

    jsonToConsole(result);

//    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }

  @Test
  @DisplayName("Retrieve the LDAP information of a department by name")
  void ldapDepartmentInfoByName() throws IOException, ParseException {
    String departmentName = "1501001 - Interkommunal arbeidsgiverkontroll i Agder";

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
//    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
    LDAPDepartmentInfoResponse result = service
      .departmentInfoByName(authTokenKey, tenant, null, departmentName);

    jsonToConsole(result);

//    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }

  @Test
  @DisplayName("Execute department level LDAP queries by id")
  void ldapDepartmentQueryById() throws IOException, ParseException {
    Integer departmentId = 2851;

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
//    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
    LDAPDepartmentQueryResponse result = service
      .departmentQueryById(authTokenKey, tenant, null, departmentId);

    jsonToConsole(result);

//    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }

  @Test
  @DisplayName("Execute department level LDAP queries by name")
  void ldapDepartmentQueryByName() throws IOException, ParseException {
    String departmentName = "1501001 - Interkommunal arbeidsgiverkontroll i Agder";

    AuthenticationService authenticationService = new AuthenticationService(endPoint);
//    LoginResponse login = authenticationService.login(tenant, user, password, null);

    LDAPService service = new LDAPService(endPoint);
    LDAPDepartmentQueryResponse result = service
      .departmentQueryByName(authTokenKey, tenant, null, departmentName);

    jsonToConsole(result);

//    authenticationService.logout(login.getAuthTokenKey(), tenant, login.getUserId(), null);
  }

  private void jsonToConsole(Object result) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
    System.out.println(json);
  }
}
