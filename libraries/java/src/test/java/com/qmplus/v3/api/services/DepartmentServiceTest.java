package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.DepartmentHierarchyResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Disabled
public class DepartmentServiceTest extends BaseTest {
  public DepartmentServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all departments")
  void listDepartments() throws IOException {
//    Logger.getLogger(BaseService.class.getName()).setLevel(Level.OFF);
    DepartmentService service = new DepartmentService();
    List<DepartmentHierarchyResponse> results = service
        .departments(getAuthTokenKey(), getTenant(), null, null);
    System.out.println();
  }
}

