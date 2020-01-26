package com.qmplus.v3.api.models.response;

import java.util.List;

/**
 * UserTypeResponse should give user type with their department to select.
 * This is used both for userType synch and for sending the userTypes for all users. In the userType synch, the roles are populated, in
 * the user synch, they are not.
 *
 * This class will generate JSON out for UserTypeRequest in UserTypeUserResponse.
 *
 * @author gaurav.chugh
 *
 */
public class UserTypeResponse
{
  private Integer departmentId;

  private Integer userTypeId;

  private String userTypeName;

  private Integer status;

  private Boolean messageDepartmentChangeAllowed;

  private List<RoleResponse> userTypeRole;

  // Comma separated String of form type id to be used in the mobile message search page. Must have at least one number for the
  // search page to be active
  private String searchFormTypes;

  public Integer getDepartmentId()
  {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId)
  {
    this.departmentId = departmentId;
  }

  public Integer getUserTypeId()
  {
    return userTypeId;
  }

  public void setUserTypeId(Integer userTypeId)
  {
    this.userTypeId = userTypeId;
  }

  public String getUserTypeName()
  {
    return userTypeName;
  }

  public void setUserTypeName(String userTypeName)
  {
    this.userTypeName = userTypeName;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }

  public Boolean getMessageDepartmentChangeAllowed()
  {
    return messageDepartmentChangeAllowed;
  }

  public void setMessageDepartmentChangeAllowed(Boolean messageDepartmentChangeAllowed)
  {
    this.messageDepartmentChangeAllowed = messageDepartmentChangeAllowed;
  }

  public List<RoleResponse> getUserTypeRole()
  {
    return userTypeRole;
  }

  public void setUserTypeRole(List<RoleResponse> userTypeRole)
  {
    this.userTypeRole = userTypeRole;
  }

  /**
   * @return the searchFormTypes
   */
  public String getSearchFormTypes()
  {
    return searchFormTypes;
  }

  /**
   * @param searchFormTypes the searchFormTypes to set
   */
  public void setSearchFormTypes(String searchFormTypes)
  {
    this.searchFormTypes = searchFormTypes;
  }

}
