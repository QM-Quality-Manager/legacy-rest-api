package com.qmplus.v3.api.models.vo;

import java.io.Serializable;

/**
 * Base class for VoObjects
 */
public class VoBase implements Serializable
{

  private static final long serialVersionUID = 1L;

  private Integer departmentId;

  private Integer userId;

  public Integer getDepartmentId()
  {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId)
  {
    this.departmentId = departmentId;
  }

  public Integer getUserId()
  {
    return userId;
  }

  public void setUserId(Integer userId)
  {
    this.userId = userId;
  }

}
