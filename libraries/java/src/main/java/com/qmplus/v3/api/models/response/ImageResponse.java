package com.qmplus.v3.api.models.response;

/**
 * ImageResponse
 *
 * THIS class will generate JSON out for imageUploaderRequest .
 *
 * @author gaurav.chugh
 *
 */
public class ImageResponse
{
  private Integer messageId;

  private String jcrId;

  /**
   * @return Id for the message the file is attached to
   */
  public Integer getMessageId()
  {
    return messageId;
  }

  public void setMessageId(Integer messageId)
  {
    this.messageId = messageId;
  }

  /**
   * @return Id for the stored file
   */
  public String getJcrId()
  {
    return jcrId;
  }

  public void setJcrId(String jcrId)
  {
    this.jcrId = jcrId;
  }

}
