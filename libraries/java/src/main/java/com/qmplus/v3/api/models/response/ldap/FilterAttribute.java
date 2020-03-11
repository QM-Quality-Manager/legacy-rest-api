package com.qmplus.v3.api.models.response.ldap;

public class FilterAttribute
{

  private String userAttribute;
  private String depAttribute;

  // Prevent this class to be instanced
  @SuppressWarnings("unused")
  private FilterAttribute()
  {}

  public FilterAttribute(String depAttribute, String userAttribute)
  {
    setDepAttribute(depAttribute);
    setUserAttribute(userAttribute);
  }

  public final void setDepAttribute(String depAttribute)
  {
    this.depAttribute = depAttribute;
  }

  public String getDepAttribute()
  {
    return depAttribute;
  }

  public final void setUserAttribute(String userAttribute)
  {
    this.userAttribute = userAttribute;
  }

  public String getUserAttribute()
  {
    return userAttribute;
  }

}
