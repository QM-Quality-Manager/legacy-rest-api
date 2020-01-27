package com.qmplus.v3.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTest {
  protected String tenant;
  protected String username;
  protected Integer userId;
  protected String password;
  protected String authTokenKey;

  public BaseTest() throws IOException {
    // Create properties file and load the resource
    Properties properties = new Properties();
    properties.load(getClass().getClassLoader().getResourceAsStream("./credentials.properties"));


    // Read the entries
    this.tenant = properties.getProperty("tenant");
    this.username = properties.getProperty("username");
    this.userId = Integer.parseInt(properties.getProperty("userId"));
    this.password = properties.getProperty("password");
    this.authTokenKey = properties.getProperty("authTokenKey");
  }

  public String getAuthTokenKey() {
    return authTokenKey;
  }

  public String getTenant() {
    return tenant;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public Integer getUserId() {
    return userId;
  }

  public static byte[] readAllBytes(InputStream inputStream) throws IOException {
    final int bufLen = 4 * 0x400; // 4KB
    byte[] buf = new byte[bufLen];
    int readLen;
    IOException exception = null;

    try {
      try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
        while ((readLen = inputStream.read(buf, 0, bufLen)) != -1)
          outputStream.write(buf, 0, readLen);

        return outputStream.toByteArray();
      }
    } catch (IOException e) {
      exception = e;
      throw e;
    } finally {
      if (exception == null) inputStream.close();
      else try {
        inputStream.close();
      } catch (IOException e) {
        exception.addSuppressed(e);
      }
    }
  }
}
