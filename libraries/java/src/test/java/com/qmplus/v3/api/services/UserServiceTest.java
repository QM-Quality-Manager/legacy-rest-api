package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import com.qmplus.v3.api.models.response.UserResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest extends BaseTest {

  @Test
  @DisplayName("List all usernames")
  void users() throws IOException {
    UserService service = new UserService();
    ResponseWrapperList<UserResponse> results = service.users(getAuthTokenKey(), getTenant(), null);
    System.out.println();
  }
}