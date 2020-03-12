package com.qmplus.v3.api.models.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.qmplus.v3.api.models.vo.Department;

import java.util.Date;
import java.util.List;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class LDAPStatusResponse {
  public Date lastSynchronizedDate = null;
  public List<Department> departmentStatuses = null;
}
