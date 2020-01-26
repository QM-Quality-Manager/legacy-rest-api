package com.qmplus.v3.api.models.vo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * To get/set data values from/to the messageField components in MessageForm
 *
 * @author gaurav.chugh
 *
 */
public class VoMessageField implements Serializable
{
  private static final long serialVersionUID = 1L;
  /**
   * messageFieldId is the Type of component in the form: category (1), question (0) or text component (7).
   * These are the 3 static values Netsmartz is using in the v4 app.
   */
  private Integer messageFieldId;
  /**
   * Representing messageFieldType. This is actually the category group type.
   */
  private Integer messageFieldType;
  /**
   * Representing messageFieldName for formText
   */
  private String messageFieldName;
  /**
   * Representing componentId
   */
  private Integer componentId;
  /**
   * Representing componentName
   */
  private String componentName;
  /**
   * Representing position of component in form
   */
  private int position;
  /**
   * Representing container right, left or center
   */
  private int containerId;
  /**
   * Representing showAs for formText/category components like drop down,check box,image,textArea,textEditor etc.
   */
  private int showAs;
  /**
   * Representing displayTagNames of id and tag name.
   */
  private Map<Integer, String> displayTagNames = new LinkedHashMap<>();

  private Integer selectedValue;

  /**
   * stringValue can have the value of TextArea,TextField etc.
   */
  private String stringValue;

  /**
   * list of categoryIds multiple choice categories,single choice ,defining category etc in Message.
   * list of AnswerOption multiple select or single select in case of questionAnswer.
   * list of risk values of risk categories.
   */
  private List<Integer> selectedIds = new LinkedList<>();
  /**
   * Representing listOfselectedIds is to drawn risk categories and save risk categories.
   */
  private List<LinkedList<Integer>> listOfSelectedIds = new LinkedList<>();
  /**
   * Representing maxRows for TextArea or TextEditor
   */
  private int maxRows;
  /**
   * Representing maxCols for TextArea or TextEditor
   */
  private int maxCols;
  /**
   * Representing isTemplate for default components
   */
  private int isTemplate;
  /**
   * Representing anonymity for form
   */
  private Integer anonymity;

  private boolean anonymityChecked;
  /**
   * Representing list of categoryDependency
   */
  private List<VoCategoryDependency> categoryDependencyList;

  public Integer getMessageFieldId()
  {
    return messageFieldId;
  }

  public void setMessageFieldId(Integer messageFieldId)
  {
    this.messageFieldId = messageFieldId;
  }

  public String getStringValue()
  {
    return stringValue;
  }

  public void setStringValue(String stringValue)
  {
    this.stringValue = stringValue;
  }

  public List<Integer> getSelectedIds()
  {
    return selectedIds;
  }

  public void setSelectedIds(List<Integer> selectedIds)
  {
    this.selectedIds = selectedIds;
  }

  public Integer getSelectedValue()
  {
    return selectedValue;
  }

  public void setSelectedValue(Integer selectedValue)
  {
    this.selectedValue = selectedValue;
  }

  public Integer getComponentId()
  {
    return componentId;
  }

  public void setComponentId(Integer componentId)
  {
    this.componentId = componentId;
  }

  public String getComponentName()
  {
    return componentName;
  }

  public void setComponentName(String componentName)
  {
    this.componentName = componentName;
  }

  public String getMessageFieldName()
  {
    return messageFieldName;
  }

  public void setMessageFieldName(String messageFieldName)
  {
    this.messageFieldName = messageFieldName;
  }

  public int getPosition()
  {
    return position;
  }

  public void setPosition(int position)
  {
    this.position = position;
  }

  public int getContainerId()
  {
    return containerId;
  }

  public void setContainerId(int containerId)
  {
    this.containerId = containerId;
  }

  public Integer getMessageFieldType()
  {
    return messageFieldType;
  }

  public void setMessageFieldType(Integer messageFieldType)
  {
    this.messageFieldType = messageFieldType;
  }

  public int getShowAs()
  {
    return showAs;
  }

  public void setShowAs(int showAs)
  {
    this.showAs = showAs;
  }

  public List<LinkedList<Integer>> getListOfSelectedIds()
  {
    return listOfSelectedIds;
  }

  public void setListOfSelectedIds(List<LinkedList<Integer>> listOfSelectedIds)
  {
    this.listOfSelectedIds = listOfSelectedIds;
  }

  public Map<Integer, String> getDisplayTagNames()
  {
    return displayTagNames;
  }

  public void setDisplayTagNames(Map<Integer, String> displayTagNames)
  {
    this.displayTagNames = displayTagNames;
  }

  public int getMaxRows()
  {
    return maxRows;
  }

  public void setMaxRows(int maxRows)
  {
    this.maxRows = maxRows;
  }

  public int getMaxCols()
  {
    return maxCols;
  }

  public void setMaxCols(int maxCols)
  {
    this.maxCols = maxCols;
  }

  public int getIsTemplate()
  {
    return isTemplate;
  }

  public void setIsTemplate(int isTemplate)
  {
    this.isTemplate = isTemplate;
  }

  public List<VoCategoryDependency> getCategoryDependencyList()
  {
    return categoryDependencyList;
  }

  public void setCategoryDependencyList(List<VoCategoryDependency> categoryDependencyList)
  {
    this.categoryDependencyList = categoryDependencyList;
  }

  public Integer getAnonymity()
  {
    return anonymity;
  }

  public void setAnonymity(Integer anonymity)
  {
    this.anonymity = anonymity;
  }

  public boolean isAnonymityChecked()
  {
    return anonymityChecked;
  }

  public void setAnonymityChecked(boolean anonymityChecked)
  {
    this.anonymityChecked = anonymityChecked;
  }

}

