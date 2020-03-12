package com.qmplus.v3.api.models.vo;

import java.util.Date;

/**
 *
 * Data class for departments. Used by the LDAPLoginImpl
 *
 */
public class Department
{
  private String name;
  private int id;
  private int parentId; // Qm+ Id, not ldap department id.
  private int active;
  private String ldapDistinguishedName;
  private String ldapUniqueIdentifier;
  private Date updated;

  public Department()
  {
    // Empty constructor
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public int getParentId()
  {
    return parentId;
  }

  public void setParentId(int parentId)
  {
    this.parentId = parentId;
  }

  public int getActive()
  {
    return active;
  }

  public void setActive(int active)
  {
    this.active = active;
  }

  public String getLdapDistinguishedName()
  {
    return ldapDistinguishedName;
  }

  public void setLdapDistinguishedName(String ldapDistinguishedName)
  {
    this.ldapDistinguishedName = ldapDistinguishedName;
  }

  public String getLdapUniqueIdentifier()
  {
    return ldapUniqueIdentifier;
  }

  public void setLdapUniqueIdentifier(String ldapUniqueIdentifier)
  {
    this.ldapUniqueIdentifier = ldapUniqueIdentifier;
  }

  /**
   * @return the updated
   */
  public Date getUpdated()
  {
    return updated;
  }

  /**
   * @param updated the updated to set
   */
  public void setUpdated(Date updated)
  {
    this.updated = updated;
  }
}
