package com.qmplus.v3.api.models.response;

/**
 * Class to hold the value of a populated message text field.
 * Currently not linked to name of field in form.
 *
 * @author Thomas
 *
 */
public class MessageTextFieldResponse
{
  private int messageTextFieldId;
  private String value;

  /**
   * @return the messageTextFieldId
   */
  public int getMessageTextFieldId()
  {
    return messageTextFieldId;
  }
  /**
   * @param messageTextFieldId the messageTextFieldId to set
   */
  public void setMessageTextFieldId(int messageTextFieldId)
  {
    this.messageTextFieldId = messageTextFieldId;
  }
  /**
   * @return the value
   */
  public String getValue()
  {
    return value;
  }
  /**
   * @param value the value to set
   */
  public void setValue(String value)
  {
    this.value = value;
  }
}
