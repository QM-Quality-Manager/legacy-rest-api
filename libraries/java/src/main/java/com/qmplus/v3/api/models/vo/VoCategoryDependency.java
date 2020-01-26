package com.qmplus.v3.api.models.vo;

import java.io.Serializable;

/**
 * The Class VoCategoryDependency.
 *
 * @author Abhinandan
 * @version 4.0
 */
public class VoCategoryDependency implements Serializable
{
  private static final long serialVersionUID = 1L;
  private Integer dependencyFor;
  private Integer dependencyOn;
  private int dependencyType;
  private Integer frmVersionId;
  private Integer dependencyCategoryGroup;

  public Integer getDependencyFor()
  {
    return dependencyFor;
  }

  public void setDependencyFor(Integer dependencyFor)
  {
    this.dependencyFor = dependencyFor;
  }

  public Integer getDependencyOn()
  {
    return dependencyOn;
  }

  public void setDependencyOn(Integer dependencyOn)
  {
    this.dependencyOn = dependencyOn;
  }

  public int getDependencyType()
  {
    return dependencyType;
  }

  public void setDependencyType(int dependencyType)
  {
    this.dependencyType = dependencyType;
  }

  public Integer getFrmVersionId()
  {
    return frmVersionId;
  }

  public void setFrmVersionId(Integer frmVersionId)
  {
    this.frmVersionId = frmVersionId;
  }

  public Integer getDependencyCategoryGroup()
  {
    return dependencyCategoryGroup;
  }

  public void setDependencyCategoryGroup(Integer dependencyCategoryGroup)
  {
    this.dependencyCategoryGroup = dependencyCategoryGroup;
  }

}
