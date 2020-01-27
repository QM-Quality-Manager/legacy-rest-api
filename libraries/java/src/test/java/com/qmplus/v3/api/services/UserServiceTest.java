package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import com.qmplus.v3.api.models.response.UserResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class UserServiceTest extends BaseTest {
  public UserServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all usernames")
  void users() throws IOException {
    UserService service = new UserService();
    List<UserResponse> results = service
        .users(getAuthTokenKey(), getTenant(), null, null);
    System.out.println();
  }
}