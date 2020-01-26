package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.request.LoginRequest;
import com.qmplus.v3.api.models.response.LoginResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServiceTest extends BaseTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  @DisplayName("Correctly login")
  void login() throws IOException {
//    AuthenticationService service = new AuthenticationService();
//    LoginResponse login = service.login(getTenant(), getUsername(), getPassword());
//    System.out.println();
  }

  @Test
  @DisplayName("Correctly login an logout")
  void logout() {
  }
}