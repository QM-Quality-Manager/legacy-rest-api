package com.qmplus.v3.api.models.request;

import com.qmplus.v3.api.models.vo.VoMessage;

/**
 * MessageRequest which needs to invoke from mobile device to send data to
 * server side.
 *
 * MessageRequest will hold voMessage Object and voMessage hold all the fields which needs
 * to send data for register new message request from client side.
 *
 * To save data from the message.
 *
 * @author gaurav.chugh
 *
 */
public class MessageRequest extends BaseRequest
{
  private VoMessage voMessage;

  public VoMessage getVoMessage()
  {
    return voMessage;
  }

  public void setVoMessage(VoMessage voMessage)
  {
    this.voMessage = voMessage;
  }
}
