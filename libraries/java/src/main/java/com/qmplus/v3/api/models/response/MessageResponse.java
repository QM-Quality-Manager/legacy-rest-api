package com.qmplus.v3.api.models.response;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * MessageResponse should give object of message.
 *
 * THIS class will generate JSON out for messageRequest and messageListRequest. Not all fields are used for each request.
 *
 * @author gaurav.chugh
 *
 */
public class MessageResponse
{
  private Integer messageId;
  private List<MessageTextFieldResponse> messageTextFields;
  // Category groupId -> List <CategoryValueResponse>
  private Map<Integer,List<CategoryValueResponse>> categoryValues;
  private DepartmentHierarchyResponse department;
  private Date registerDate;
  private List<Integer> closedTime;

  public Integer getMessageId()
  {
    return messageId;
  }

  public void setMessageId(Integer messageId)
  {
    this.messageId = messageId;
  }

  public Date getRegisterDate()
  {
    return registerDate;
  }

  public void setRegisterDate(Date registerDate)
  {
    this.registerDate = registerDate;
  }

  public List<Integer> getClosedTime()
  {
    return closedTime;
  }

  public void setClosedTime(List<Integer> closedTime)
  {
    this.closedTime = closedTime;
  }

  /**
   * @return the messageTextFields
   */
  public List<MessageTextFieldResponse> getMessageTextFields()
  {
    return messageTextFields;
  }

  /**
   * @param messageTextFields the messageTextFields to set
   */
  public void setMessageTextFields(List<MessageTextFieldResponse> messageTextFields)
  {
    this.messageTextFields = messageTextFields;
  }

  /**
   * @return the department
   */
  public DepartmentHierarchyResponse getDepartment()
  {
    return department;
  }

  /**
   * @param department the department to set
   */
  public void setDepartment(DepartmentHierarchyResponse department)
  {
    this.department = department;
  }

  /**
   * @return the categoryValues
   */
  public Map<Integer, List<CategoryValueResponse>> getCategoryValues()
  {
    return categoryValues;
  }

  /**
   * @param categoryValues the categoryValues to set
   */
  public void setCategoryValues(Map<Integer, List<CategoryValueResponse>> categoryValues)
  {
    this.categoryValues = categoryValues;
  }


}
