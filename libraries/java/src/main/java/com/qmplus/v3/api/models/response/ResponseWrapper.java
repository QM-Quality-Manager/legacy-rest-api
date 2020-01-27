package com.qmplus.v3.api.models.response;

import java.util.List;

/**
 * ResponseWrapper is parent class which will be returned for every REST
 * request. This class is responsible to generate error message, code etc about
 * the request. Inner request (i.e. content property) will be treated only if
 * there is NO BINDING error with the request.
 *
 * @author vipul.vohra
 * @author gaurav.chugh
 *
 * @param <T> ResponseWrapper is a Generic wrapper around the returned HTTP result
 */
public class ResponseWrapper<T>
{
  /**
   * holder for status code (like 200)
   */
  private int status;

  /**
   * holder for status message of the response
   */
  private String message;

  /**
   * Flag which represent if there is any errors in the response or not.
   */
  private boolean hasError;

  /**
   * List of errors string with localized messages.
   */
  private List<String> errors;

  /**
   * holder for last sync date in case of synchronization
   */
  private Long lastSyncDate;

  /**
   * Generic response type entity (like LoginReponse) which needs to embed
   * with in response
   */
  private T content;

  public ResponseWrapper(T responseEntity)
  {
    this.content = responseEntity;
  }

  public ResponseWrapper(int status, String message, boolean hasError)
  {
    this.status = status;
    this.message = message;
    this.hasError = hasError;
  }

  public ResponseWrapper(int status, String message, boolean hasError, List<String> errors)
  {
    this(status, message, hasError);
    this.errors = errors;
  }

  public ResponseWrapper()
  {}

  public int getStatus()
  {
    return status;
  }

  public void setStatus(int status)
  {
    this.status = status;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public T getContent()
  {
    return content;
  }

  public void setContent(T content)
  {
    this.content = content;
  }

  public boolean isHasError()
  {
    return hasError;
  }

  public void setHasError(boolean hasError)
  {
    this.hasError = hasError;
  }

  public List<String> getErrors()
  {
    return errors;
  }

  public void setErrors(List<String> errors)
  {
    this.errors = errors;
  }

  public Long getLastSyncDate()
  {
    return lastSyncDate;
  }

  public void setLastSyncDate(Long lastSyncDate)
  {
    this.lastSyncDate = lastSyncDate;
  }

}
