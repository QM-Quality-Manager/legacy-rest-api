package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.MessageResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import com.qmplus.v3.api.models.response.UserResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MessageServiceTest extends BaseTest {

  @Test
  @DisplayName("List all messages")
  void messageList() throws IOException, ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    MessageService service = new MessageService();
    MessageService.Query query = new MessageService.Query();
    query.setFromDate(formatter.parse("01-01-2019"));
    query.setToDate(formatter.parse("31-01-2019"));

    ResponseWrapperList<MessageResponse> results = service.messageList(getAuthTokenKey(), getTenant(), 1, 1, query);
    System.out.println();
  }

  @Test
  @DisplayName("Get single message")
  void message() throws IOException, ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    MessageService service = new MessageService();
    MessageService.Query query = new MessageService.Query();
    query.setFromDate(formatter.parse("01-01-2019"));
    query.setToDate(formatter.parse("31-01-2019"));

    ResponseWrapper<MessageResponse> results = service.message(getAuthTokenKey(), getTenant(), 1, 1, 4589);
    System.out.println();
  }
}
