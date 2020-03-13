package com.qmplus.v3.api.models.response;

import com.qmplus.v3.api.models.response.ldap.DepartmentLDAPSetting;
import com.qmplus.v3.api.models.vo.Department;

import java.util.List;

public class LDAPDepartmentInfoResponse {
  private Department department;
  private List<DepartmentLDAPSetting> settings;

  public void setDepartment(Department department) {
    this.department = department;
  }

  public void setSettings(List<DepartmentLDAPSetting> settings) {
    this.settings = settings;
  }

  public Department getDepartment() {
    return department;
  }

  public List<DepartmentLDAPSetting> getSettings() {
    return settings;
  }
}
