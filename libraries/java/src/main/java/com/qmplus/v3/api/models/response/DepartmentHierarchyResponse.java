package com.qmplus.v3.api.models.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains data for a department object.
 *
 * @author gaurav.chugh
 *
 */
public class DepartmentHierarchyResponse
{
  private Integer departmentId;

  private String departmentName;

  private Integer parent;

  private Integer status;

  private List<RoleResponse> departmentRole = new ArrayList<RoleResponse>();

  public Integer getDepartmentId()
  {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId)
  {
    this.departmentId = departmentId;
  }

  public String getDepartmentName()
  {
    return departmentName;
  }

  public void setDepartmentName(String departmentName)
  {
    this.departmentName = departmentName;
  }

  public Integer getParent()
  {
    return parent;
  }

  public void setParent(Integer parent)
  {
    this.parent = parent;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }

  public List<RoleResponse> getDepartmentRole()
  {
    return departmentRole;
  }

  public void setDepartmentRole(List<RoleResponse> departmentRole)
  {
    this.departmentRole = departmentRole;
  }
}
