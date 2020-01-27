package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.TaskResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Disabled
public class TaskServiceTest extends BaseTest {
  public TaskServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all tasks")
  void tasks() throws IOException {
    TaskService service = new TaskService();
    List<TaskResponse> results = service
        .taskList(getAuthTokenKey(), getTenant(), 1, 1, null);
    System.out.println();
  }

  @Test
  @DisplayName("List a single task")
  void task() throws IOException {
    TaskService service = new TaskService();
    TaskResponse result = service
        .task(getAuthTokenKey(), getTenant(), 1081, 1, 1, null);
    System.out.println();
  }

  @Test
  @DisplayName("Mark a task done")
  void done() throws IOException {
    TaskService service = new TaskService();
    TaskResponse result = service
        .done(getAuthTokenKey(), getTenant(), 1081, "Done", new Date(), true, null, null);
    System.out.println();
  }
}
