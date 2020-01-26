package com.qmplus.v3.api.errors;

import com.qmplus.v3.api.models.response.ResponseWrapper;

public class ApiException extends RuntimeException {
  private ResponseWrapper response;

  public ApiException(ResponseWrapper response) {
    this.response = response;
  }
}
