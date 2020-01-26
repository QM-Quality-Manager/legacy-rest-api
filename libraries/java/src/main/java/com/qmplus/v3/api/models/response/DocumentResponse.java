package com.qmplus.v3.api.models.response;

/**
 * DocumentResponse should give list of attachedDocument in form.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class DocumentResponse
{
  private Integer id;

  private String name;

  private String link;

  private String type;

  private Boolean heritage;

  private Integer departmentId;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getLink()
  {
    return link;
  }

  public void setLink(String link)
  {
    this.link = link;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public Boolean isHeritage()
  {
    return heritage;
  }

  public void setHeritage(Boolean heritage)
  {
    this.heritage = heritage;
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
