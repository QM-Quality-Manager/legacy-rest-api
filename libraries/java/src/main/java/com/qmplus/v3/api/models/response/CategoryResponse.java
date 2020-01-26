package com.qmplus.v3.api.models.response;

/**
 * FormCategoryResponse should give list of Category.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class CategoryResponse
{
  private String name;

  private Integer id;

  private Integer status;

  private String info;

  private boolean heritage;

  private Double cost;

  private PriorityResponse priority;

  private DocumentResponse document;

  private Integer departmentId;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }

  public String getInfo()
  {
    return info;
  }

  public void setInfo(String info)
  {
    this.info = info;
  }

  public boolean isHeritage()
  {
    return heritage;
  }

  public void setHeritage(boolean heritage)
  {
    this.heritage = heritage;
  }

  public Double getCost()
  {
    return cost;
  }

  public void setCost(Double cost)
  {
    this.cost = cost;
  }

  public PriorityResponse getPriority()
  {
    return priority;
  }

  public void setPriority(PriorityResponse priority)
  {
    this.priority = priority;
  }

  public DocumentResponse getDocument()
  {
    return document;
  }

  public void setDocument(DocumentResponse document)
  {
    this.document = document;
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