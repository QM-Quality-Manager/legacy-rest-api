package com.qmplus.v3.api.models.response.ldap;

public class BaseFilter
{

  private String filterPart;

  // Prevent this class to be instanced
  @SuppressWarnings("unused")
  private BaseFilter()
  {}

  public BaseFilter(String filterPart)
  {
    setFilterPart(filterPart);
  }

  /**
   * @return filter part eg. (objectClass=user)
   */
  public String getFilterPart()
  {
    return filterPart;
  }

  private void setFilterPart(String filterPart)
  {
    this.filterPart = filterPart;
  }

}
