package com.qmplus.v3.api.models.request;

/**
 * ImageUploaderRequest which needs to invoke from mobile device to send data to
 * server side.
 *
 * ImageUploaderRequest will hold fileName and fileArr to upload image in register new message.
 *
 * To save into JCR repository.
 *
 * @author gaurav.chugh
 *
 */
public class ImageUploaderRequest extends BaseRequest
{
  private Integer messageId;

  private String fileName;

  private String fileArr;

  public Integer getMessageId()
  {
    return messageId;
  }

  public void setMessageId(Integer messageId)
  {
    this.messageId = messageId;
  }

  public String getFileName()
  {
    return fileName;
  }

  public void setFileName(String fileName)
  {
    this.fileName = fileName;
  }

  public String getFileArr()
  {
    return fileArr;
  }

  public void setFileArr(String fileArr)
  {
    this.fileArr = fileArr;
  }

}
