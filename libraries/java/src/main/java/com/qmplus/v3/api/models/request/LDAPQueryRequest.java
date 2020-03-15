package com.qmplus.v3.api.models.request;

import java.util.List;

public class LDAPQueryRequest extends BaseRequest {
  private String searchBase;
  private List<String> filters;

  public String getSearchBase() {
    return searchBase;
  }

  public void setSearchBase(String searchBase) {
    this.searchBase = searchBase;
  }

  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }
}
