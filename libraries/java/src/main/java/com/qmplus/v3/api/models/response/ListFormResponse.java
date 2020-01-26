package com.qmplus.v3.api.models.response;

/**
 * ListFormResponse should give list of formList like control etc.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class ListFormResponse
{
  private Integer id;

  private String name;

  private Integer formId;

  private Integer departmentId;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Integer getFormId()
  {
    return formId;
  }

  public void setFormId(Integer formId)
  {
    this.formId = formId;
  }

  public Integer getDepartmentId()
  {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId)
  {
    this.departmentId = departmentId;
  }

}
