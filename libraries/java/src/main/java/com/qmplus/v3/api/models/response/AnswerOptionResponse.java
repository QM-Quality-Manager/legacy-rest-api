package com.qmplus.v3.api.models.response;

/**
 * AnswerOptionResponse should give list of answerOption of question.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class AnswerOptionResponse
{
  private Integer id;
  private String optionName;
  private int position;
  private int numbering;

  public String getOptionName()
  {
    return optionName;
  }

  public void setOptionName(String optionName)
  {
    this.optionName = optionName;
  }

  public int getPosition()
  {
    return position;
  }

  public void setPosition(int position)
  {
    this.position = position;
  }

  public int getNumbering()
  {
    return numbering;
  }

  public void setNumbering(int numbering)
  {
    this.numbering = numbering;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

}
