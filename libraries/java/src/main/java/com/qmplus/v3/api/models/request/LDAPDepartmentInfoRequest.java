package com.qmplus.v3.api.models.request;

public class LDAPDepartmentInfoRequest extends BaseRequest {
  private String name;
  private Integer id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
