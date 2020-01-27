package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.FormResponse;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

@Disabled
public class FormServiceTest extends BaseTest {
  public FormServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all forms")
  void listForms() throws IOException {
    FormService service = new FormService();
    List<FormResponse> results = service
        .formList(getAuthTokenKey(), getTenant(), 1, 1, null, null);
    System.out.println();
  }
}

