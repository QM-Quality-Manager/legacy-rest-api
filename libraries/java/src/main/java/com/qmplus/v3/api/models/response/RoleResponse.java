package com.qmplus.v3.api.models.response;

/**
 * RoleResponse should give list of roles.
 *
 * THIS class will generate JSON out for formRequest,departmentRequest etc .
 *
 * @author gaurav.chugh
 *
 */
public class RoleResponse
{
  /**
   * Representing roleId
   */
  private Integer roleId;

  /**
   * Representing status : Active (1) or In-Active (2)
   */
  private Integer status;

  public Integer getRoleId()
  {
    return roleId;
  }

  public void setRoleId(Integer roleId)
  {
    this.roleId = roleId;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }
}
