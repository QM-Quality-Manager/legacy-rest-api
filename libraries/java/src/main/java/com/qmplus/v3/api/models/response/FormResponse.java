package com.qmplus.v3.api.models.response;

import java.util.ArrayList;
import java.util.List;

/**
 * FormResponse should give list of form with their department to select.
 *
 * THIS class will generate JSON out for FormRequest .
 *
 * @author gaurav.chugh
 *
 */
public class FormResponse
{
  private Integer formId;

  private String formName;

  private String buttonText;

  private String formType;

  private Integer formTypeId;

  private String formInfo;

  private Integer formVersion;

  private Integer status;

  private Integer departmentId;

  private String departmentName;

  private String colour;

  private Integer columns;

  private Boolean heritage;

  private Integer anonymity;

  private int orderType; // Used to store sort by type or index value. Not sent to client.

  private List<DocumentResponse> attachedDocuments = new ArrayList<>();

  // List of all (text) components in the form.
  private List<FormLayoutResponse> formLayout = new ArrayList<>();

  // All categories in the form are grouped inside the category groups. Only id information for categories here.
  private List<CategoryGroupResponse> categoryGroup = new ArrayList<>();

  private List<CategoryDependencyResponse> categoryDependency = new ArrayList<>();

  private List<RoleResponse> formRole = new ArrayList<>();

  /* These do not exist in V3 */
  private List<Integer> attachedFormIds = new ArrayList<>();
  private List<ListFormResponse> attachedList = new ArrayList<>();
  private List<QuestionResponse> question = new ArrayList<>();

  public Integer getFormId()
  {
    return formId;
  }

  public void setFormId(Integer formId)
  {
    this.formId = formId;
  }

  public String getFormName()
  {
    return formName;
  }

  public void setFormName(String formName)
  {
    this.formName = formName;
  }

  public String getFormType()
  {
    return formType;
  }

  public void setFormType(String formType)
  {
    this.formType = formType;
  }

  public String getFormInfo()
  {
    return formInfo;
  }

  public void setFormInfo(String formInfo)
  {
    this.formInfo = formInfo;
  }

  public Integer getFormVersion()
  {
    return formVersion;
  }

  public void setFormVersion(Integer formVersion)
  {
    this.formVersion = formVersion;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }

  public Integer getDepartmentId()
  {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId)
  {
    this.departmentId = departmentId;
  }

  public String getDepartmentName()
  {
    return departmentName;
  }

  public void setDepartmentName(String departmentName)
  {
    this.departmentName = departmentName;
  }

  public Integer getColumns()
  {
    return columns;
  }

  public void setColumns(Integer columns)
  {
    this.columns = columns;
  }

  public List<FormLayoutResponse> getFormLayout()
  {
    return formLayout;
  }

  public void setFormLayout(List<FormLayoutResponse> formLayout)
  {
    this.formLayout = formLayout;
  }

  public List<CategoryGroupResponse> getCategoryGroup()
  {
    return categoryGroup;
  }

  public void setCategoryGroup(List<CategoryGroupResponse> categoryGroup)
  {
    this.categoryGroup = categoryGroup;
  }

  public Boolean isHeritage()
  {
    return heritage;
  }

  public void setHeritage(Boolean heritage)
  {
    this.heritage = heritage;
  }

  public List<DocumentResponse> getAttachedDocuments()
  {
    return attachedDocuments;
  }

  public void setAttachedDocuments(List<DocumentResponse> attachedDocuments)
  {
    this.attachedDocuments = attachedDocuments;
  }

  public List<Integer> getAttachedFormIds()
  {
    return attachedFormIds;
  }

  public void setAttachedFormIds(List<Integer> attachedFormIds)
  {
    this.attachedFormIds = attachedFormIds;
  }

  public List<CategoryDependencyResponse> getCategoryDependency()
  {
    return categoryDependency;
  }

  public void setCategoryDependency(List<CategoryDependencyResponse> categoryDependency)
  {
    this.categoryDependency = categoryDependency;
  }

  public List<ListFormResponse> getAttachedList()
  {
    return attachedList;
  }

  public void setAttachedList(List<ListFormResponse> attachedList)
  {
    this.attachedList = attachedList;
  }

  public List<QuestionResponse> getQuestion()
  {
    return question;
  }

  public void setQuestion(List<QuestionResponse> question)
  {
    this.question = question;
  }

  public Integer getAnonymity()
  {
    return anonymity;
  }

  public void setAnonymity(Integer anonymity)
  {
    this.anonymity = anonymity;
  }

  public Integer getFormTypeId()
  {
    return formTypeId;
  }

  public void setFormTypeId(Integer formTypeId)
  {
    this.formTypeId = formTypeId;
  }

  public List<RoleResponse> getFormRole()
  {
    return formRole;
  }

  public void setFormRole(List<RoleResponse> formRole)
  {
    this.formRole = formRole;
  }

  /**
   * @return the buttonText
   */
  public String getButtonText()
  {
    return buttonText;
  }

  /**
   * @param buttonText the buttonText to set
   */
  public void setButtonText(String buttonText)
  {
    this.buttonText = buttonText;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "FormResponse [formId=" + formId + ", formName=" + formName + ", buttonText=" + buttonText + ", formType=" + formType
        + ", formTypeId=" + formTypeId + ", formInfo=" + formInfo + ", formVersion=" + formVersion + ", status=" + status
        + ", departmentId=" + departmentId + ", departmentName=" + departmentName + ", columns=" + columns + ", heritage=" + heritage
        + ", anonymity=" + anonymity + ", attachedDocuments=" + attachedDocuments + ", formLayout=" + formLayout + ", categoryGroup="
        + categoryGroup + ", categoryDependency=" + categoryDependency + ", formRole=" + formRole + ", attachedFormIds=" + attachedFormIds
        + ", attachedList=" + attachedList + ", question=" + question + "]";
  }

  /**
   * @return the orderType
   */
  public int getOrderType()
  {
    return orderType;
  }

  /**
   * @param orderType the orderType to set
   */
  public void setOrderType(int orderType)
  {
    this.orderType = orderType;
  }

  /**
   * @return the colour
   */
  public String getColour()
  {
    return colour;
  }

  /**
   * @param colour the colour to set
   */
  public void setColour(String colour)
  {
    this.colour = colour;
  }


}
