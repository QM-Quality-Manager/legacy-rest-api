package com.qmplus.v3.api.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qmplus.v3.api.errors.ApiException;
import com.qmplus.v3.api.models.response.ResponseWrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class BaseService {
  protected final String endPoint;

  public BaseService() {
    this.endPoint = "https://www.qmplus.com/qmplus/rest";
  }

  public BaseService(String endPoint) {
    this.endPoint = endPoint == null ? "https://www.qmplus.com/qmplus/rest" : endPoint;
  }

  protected <T> ResponseWrapper<T> executeOperation(TypeReference<ResponseWrapper<T>> reference, String path, String json) throws IOException {
    // Generate the connection URL
    URL url = new URL(String.format("%s/%s", endPoint, path));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", "application/json");

    // Write the json
    OutputStream os = conn.getOutputStream();
    os.write(json.getBytes());
    os.flush();

    // Check if the response was ok
    if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
      throw new RuntimeException("Failed : HTTP error code : "
          + conn.getResponseCode());
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(
        (conn.getInputStream())));
    String returnJson = br.lines().collect(Collectors.joining());

    // Attempt to deserialize into json object
    ObjectMapper mapper = new ObjectMapper();
    ResponseWrapper<T> response = mapper.readValue(returnJson, reference);

    if (response.isHasError()) {
      throw new ApiException(response);
    }

    return response;
  }

  protected String toJson(Object object) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.writeValueAsString(object);
  }
}
