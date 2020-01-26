package com.qmplus.v3.api.models.response;

/**
 * CategoryDependencyResponse should give list of categoryDependency with their category to select.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class CategoryDependencyResponse
{
  private Integer dependentFor;

  private Integer dependentOn;

  private Integer type;

  public Integer getDependentFor()
  {
    return dependentFor;
  }

  public void setDependentFor(Integer dependentFor)
  {
    this.dependentFor = dependentFor;
  }

  public Integer getDependentOn()
  {
    return dependentOn;
  }

  public void setDependentOn(Integer dependentOn)
  {
    this.dependentOn = dependentOn;
  }

  public Integer getType()
  {
    return type;
  }

  public void setType(Integer type)
  {
    this.type = type;
  }

}
