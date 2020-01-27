package com.qmplus.v3.api.models.response;

import java.util.List;

/**
 * ResponseWrapperList is class which will be returned for REST request.
 *
 * @author gaurav.chugh
 *
 * @param <T> ResponseWrapperList is a Generic wrapper around the returned HTTP result
 */
public class ResponseWrapperList<T>
{
  /**
   * Generic response type entity which needs to embedded with in response in
   * List
   */
  List<T> contentList;

  public List<T> getContentList()
  {
    return contentList;
  }

  public void setContentList(List<T> contentList)
  {
    this.contentList = contentList;
  }

}
