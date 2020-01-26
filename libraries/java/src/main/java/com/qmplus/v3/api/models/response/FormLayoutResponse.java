package com.qmplus.v3.api.models.response;

/**
 * FormLayoutResponse should give list of formLayout like control etc.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */

/**
 * position seems to be defined with that typo error in the api, so then we have to follow here..
 *
 */
public class FormLayoutResponse
{
  private Integer id;

  private String controlType;

  private Integer optional;

  private Integer position;

  private Integer template;

  private String parentControl;

  private String labelText;

  private Integer rows;

  private Integer columns;

  private String validationType;

  private String instructions;

  private Integer entityType;

  private Integer required;

  private Integer hidden;

  private Integer encrypted;

  private Integer maxLength;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getControlType()
  {
    return controlType;
  }

  public void setControlType(String controlType)
  {
    this.controlType = controlType;
  }

  public Integer getOptional()
  {
    return optional;
  }

  public void setOptional(Integer optional)
  {
    this.optional = optional;
  }

  public Integer getPosition()
  {
    return position;
  }

  public void setPosition(Integer position)
  {
    this.position = position;
  }

  public Integer getTemplate()
  {
    return template;
  }

  public void setTemplate(Integer template)
  {
    this.template = template;
  }

  public String getParentControl()
  {
    return parentControl;
  }

  public void setParentControl(String parentControl)
  {
    this.parentControl = parentControl;
  }

  public String getLabelText()
  {
    return labelText;
  }

  public void setLabelText(String labelText)
  {
    this.labelText = labelText;
  }

  public Integer getRows()
  {
    return rows;
  }

  public void setRows(Integer rows)
  {
    this.rows = rows;
  }

  public Integer getColumns()
  {
    return columns;
  }

  public void setColumns(Integer columns)
  {
    this.columns = columns;
  }

  public String getValidationType()
  {
    return validationType;
  }

  public void setValidationType(String validationType)
  {
    this.validationType = validationType;
  }

  public String getInstructions()
  {
    return instructions;
  }

  public void setInstructions(String instructions)
  {
    this.instructions = instructions;
  }

  public Integer getEntityType()
  {
    return entityType;
  }

  public void setEntityType(Integer entityType)
  {
    this.entityType = entityType;
  }

  public Integer getRequired()
  {
    return required;
  }

  public void setRequired(Integer required)
  {
    this.required = required;
  }

  public Integer getHidden()
  {
    return hidden;
  }

  public void setHidden(Integer hidden)
  {
    this.hidden = hidden;
  }

  public Integer getEncrypted()
  {
    return encrypted;
  }

  public void setEncrypted(Integer encrypted)
  {
    this.encrypted = encrypted;
  }

  public Integer getMaxLength()
  {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength)
  {
    this.maxLength = maxLength;
  }
}
