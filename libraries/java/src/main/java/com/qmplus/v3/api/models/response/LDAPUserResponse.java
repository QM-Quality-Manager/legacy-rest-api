package com.qmplus.v3.api.models.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class LDAPUserResponse {
  private List<Object> attributes;

  public void setAttributes(List<Object> attributes) {
    this.attributes = attributes;
  }

  public List<Object> getAttributes() {
    return attributes;
  }
}
