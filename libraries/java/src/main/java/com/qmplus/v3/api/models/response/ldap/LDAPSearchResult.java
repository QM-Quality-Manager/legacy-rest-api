package com.qmplus.v3.api.models.response.ldap;

import java.util.ArrayList;
import java.util.List;

public class LDAPSearchResult {
  private List<List<Object>> results = new ArrayList<>();
  private DepartmentLDAPSetting settings;

  public void add(List<Object> ldapAttributeList) {
    results.add(ldapAttributeList);
  }

  public List<List<Object>> getResults() {
    return results;
  }

  public void setDepartmentLDAPSetting(DepartmentLDAPSetting settings) {
    this.settings = settings;
  }

  public DepartmentLDAPSetting getSettings() {
    return settings;
  }
}
