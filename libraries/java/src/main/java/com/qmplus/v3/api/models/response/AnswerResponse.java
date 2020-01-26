package com.qmplus.v3.api.models.response;

import java.util.List;

/**
 * AnswerResponse should give list of answers of question.
 *
 * THIS class will generate JSON out for formRequest .
 *
 * @author gaurav.chugh
 *
 */
public class AnswerResponse
{
  private Integer id;
  private String answer;
  private List<AnswerOptionResponse> answerOptions;

  public String getAnswer()
  {
    return answer;
  }

  public void setAnswer(String answer)
  {
    this.answer = answer;
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public List<AnswerOptionResponse> getAnswerOptions()
  {
    return answerOptions;
  }

  public void setAnswerOptions(List<AnswerOptionResponse> answerOptions)
  {
    this.answerOptions = answerOptions;
  }

}
