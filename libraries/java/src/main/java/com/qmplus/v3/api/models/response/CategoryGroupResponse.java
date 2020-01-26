package com.qmplus.v3.api.models.response;

import java.util.ArrayList;
import java.util.List;

/**
 * FormCategoryGroupResponse should give list of Category group.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class CategoryGroupResponse
{
  private Integer id;

  private String name;

  private String type;

  private String parentColumn;

  private boolean heritage;

  private List<CategoryResponse> category = new ArrayList<>();

  private Integer position;

  private Integer showAs;

  private Integer showInMobile; // 1 -> TRUE. Category group shown in mobile.

  private Integer mandatory;

  private Integer status;

  private String info;

  private Integer parent;

  private int departmentId;

  private RiskDataResponse riskData;

  private boolean mobileSearch;

  private DocumentResponse document;

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

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getParentColumn()
  {
    return parentColumn;
  }

  public void setParentColumn(String parentColumn)
  {
    this.parentColumn = parentColumn;
  }

  public boolean isHeritage()
  {
    return heritage;
  }

  public void setHeritage(boolean heritage)
  {
    this.heritage = heritage;
  }

  public List<CategoryResponse> getCategory()
  {
    return category;
  }

  public void setCategory(List<CategoryResponse> category)
  {
    this.category = category;
  }

  public Integer getPosition()
  {
    return position;
  }

  public void setPosition(Integer position)
  {
    this.position = position;
  }

  public Integer getShowAs()
  {
    return showAs;
  }

  public void setShowAs(Integer showAs)
  {
    this.showAs = showAs;
  }

  public Integer getShowInMobile()
  {
    return showInMobile;
  }

  public void setShowInMobile(Integer showInMobile)
  {
    this.showInMobile = showInMobile;
  }

  public Integer getMandatory()
  {
    return mandatory;
  }

  public void setMandatory(Integer mandatory)
  {
    this.mandatory = mandatory;
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

  public Integer getParent()
  {
    return parent;
  }

  public void setParent(Integer parent)
  {
    this.parent = parent;
  }

  public int getDepartmentId()
  {
    return departmentId;
  }

  public void setDepartmentId(int departmentId)
  {
    this.departmentId = departmentId;
  }

  public RiskDataResponse getRiskData()
  {
    return riskData;
  }

  public void setRiskData(RiskDataResponse riskData)
  {
    this.riskData = riskData;
  }

  /**
   * @return the mobileSearch
   */
  public boolean isMobileSearch()
  {
    return mobileSearch;
  }

  /**
   * @param mobileSearch the mobileSearch to set
   */
  public void setMobileSearch(boolean mobileSearch)
  {
    this.mobileSearch = mobileSearch;
  }

  public DocumentResponse getDocument()
  {
    return document;
  }

  public void setDocument(DocumentResponse document)
  {
    this.document = document;
  }


}
