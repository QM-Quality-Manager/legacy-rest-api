package com.qmplus.v3.api.models.response;

import java.util.ArrayList;
import java.util.List;

/**
 * UserResponse should give list of UserType with their department to select.
 *
 * THIS class will generate JSON out for UserRequest .
 *
 * @author gaurav.chugh
 *
 */
public class UserResponse extends LoginResponse
{
  private Integer status;

  private List<UserTypeResponse> userTypeDepartment = new ArrayList<UserTypeResponse>();

  List<RoleResponse> userRole = new ArrayList<RoleResponse>();

  public List<UserTypeResponse> getUserTypeDepartment()
  {
    return userTypeDepartment;
  }

  public void setUserTypeDepartment(List<UserTypeResponse> userTypeDepartment)
  {
    this.userTypeDepartment = userTypeDepartment;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }

  /**
   * @return the userRole
   */
  public List<RoleResponse> getUserRole()
  {
    return userRole;
  }

  /**
   * @param userRole the userRole to set
   */
  public void setUserRole(List<RoleResponse> userRole)
  {
    this.userRole = userRole;
  }


}
