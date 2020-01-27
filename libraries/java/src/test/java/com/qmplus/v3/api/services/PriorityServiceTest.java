package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.PriorityResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

@Disabled
public class PriorityServiceTest extends BaseTest {
  public PriorityServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all priorities")
  void listPriorities() throws IOException {
    PriorityService service = new PriorityService();
    List<PriorityResponse> results = service
        .priorities(getAuthTokenKey(), getTenant(), 1, 1, null, null);
    System.out.println();
  }
}
