package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.SynchronizationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Disabled
public class SynchronizationServiceTest extends BaseTest {
  public SynchronizationServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("Check last synchronization details")
  void executeSynchronizationStatus() throws IOException {
    SynchronizationService service = new SynchronizationService();
    SynchronizationResponse result = service
        .assets(getAuthTokenKey(), getTenant(),
            null, null, null,
            null, null, null, null);
    System.out.println();
  }
}