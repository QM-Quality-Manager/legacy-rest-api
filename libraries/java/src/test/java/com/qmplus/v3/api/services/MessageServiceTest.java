package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.ImageResponse;
import com.qmplus.v3.api.models.response.MessageResponse;
import com.qmplus.v3.api.models.response.ResponseWrapper;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import com.qmplus.v3.api.models.vo.VoMessage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@Disabled
public class MessageServiceTest extends BaseTest {
  public MessageServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all messages")
  void messageList() throws IOException, ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    MessageService service = new MessageService();
    MessageService.Query query = new MessageService.Query();
    query.setFromDate(formatter.parse("01-01-2019"));
    query.setToDate(formatter.parse("31-01-2019"));

    List<MessageResponse> results = service
        .messageList(getAuthTokenKey(), getTenant(), 1, 1, query, null);
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

    MessageResponse results = service
        .message(getAuthTokenKey(), getTenant(), 1, 1, 4589, null);
    System.out.println();
  }

  @Test
  @Disabled
  @DisplayName("Save a new message")
  void saveANewMessage() throws IOException, ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    // Requires a valid userId
    // Requires a valid departmentId
    // Requires a valid formVersionId
    // Requires a valid priorityId

    VoMessage voMessage = new VoMessage();
    voMessage.setRegisteredBy(getUserId());
    voMessage.setRegisteredOnBehalf(getUserId());
    voMessage.setTextJson("Hello world");
    voMessage.setDepartmentId(1);
    voMessage.setFormVersionId(179);
    voMessage.setPriorityId(1);
    voMessage.setRegisteredDate(new Date());
    voMessage.setIncidentDate(new Date());

    // Execute service
    MessageService service = new MessageService();
    MessageResponse result = service
        .save(getAuthTokenKey(), getTenant(), voMessage, null);
    System.out.println();
  }

  @Test
  @Disabled
  @DisplayName("Upload image")
  void uploadImage() throws IOException, ParseException {
    MessageService service = new MessageService();

    // Load the image from the resource
    InputStream imageInputStream = getClass().getClassLoader().getResourceAsStream("./images/sample_image.png");
    byte[] buffer = readAllBytes(imageInputStream);

    // Base64 encode
    String bufferBase64 = Base64.getEncoder().encodeToString(buffer);

    ImageResponse result = service
        .uploadImage(getAuthTokenKey(), getTenant(), 5110, "an_image.jpg", bufferBase64, null);
    System.out.println();
  }
}

