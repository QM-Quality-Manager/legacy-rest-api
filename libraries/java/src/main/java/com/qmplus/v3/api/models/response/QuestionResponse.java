package com.qmplus.v3.api.models.response;

import java.util.List;

/**
 * QuestionResponse should give list of question.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class QuestionResponse
{
  private Integer id;

  private String question;

  private Integer typeId;

  private Integer formatId;

  private String format;

  private String type;

  private Integer departmentId;

  private String parentControl;

  private Integer position;

  private String info;

  private List<AnswerResponse> answers;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getQuestion()
  {
    return question;
  }

  public void setQuestion(String question)
  {
    this.question = question;
  }

  public Integer getTypeId()
  {
    return typeId;
  }

  public void setTypeId(Integer typeId)
  {
    this.typeId = typeId;
  }

  public Integer getFormatId()
  {
    return formatId;
  }

  public void setFormatId(Integer formatId)
  {
    this.formatId = formatId;
  }

  public Integer getDepartmentId()
  {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId)
  {
    this.departmentId = departmentId;
  }

  public String getParentControl()
  {
    return parentControl;
  }

  public void setParentControl(String parentControl)
  {
    this.parentControl = parentControl;
  }

  public Integer getPosition()
  {
    return position;
  }

  public void setPostion(Integer position)
  {
    this.position = position;
  }

  public List<AnswerResponse> getAnswers()
  {
    return answers;
  }

  public void setAnswers(List<AnswerResponse> answers)
  {
    this.answers = answers;
  }

  public String getFormat()
  {
    return format;
  }

  public void setFormat(String format)
  {
    this.format = format;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getInfo()
  {
    return info;
  }

  public void setInfo(String info)
  {
    this.info = info;
  }

}
