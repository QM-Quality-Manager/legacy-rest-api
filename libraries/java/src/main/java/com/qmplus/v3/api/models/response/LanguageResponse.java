package com.qmplus.v3.api.models.response;

/**
 * LanguageResponse should give list of language of tenant.
 *
 * THIS class will generate JSON out for LanguageRequest .
 *
 * @author gaurav.chugh
 *
 */
public class LanguageResponse
{
  private Integer id;

  private String name;

  private Integer status;

  private String locale;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }

  public String getLocale()
  {
    return locale;
  }

  public void setLocale(String locale)
  {
    this.locale = locale;
  }

}
