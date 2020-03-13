package com.qmplus.v3.api.models.response.ldap;

public class DepartmentLDAPSetting {
  private Integer depNr;
  private Integer connectionId;
  private String searchBase;
  private String LDAPFilter;
  private Integer LDAPServer;
  private Integer ActiveStatus;
  private Integer OverRideDep;

  public Integer getDepNr() {
    return depNr;
  }

  public void setDepNr(Integer depNr) {
    this.depNr = depNr;
  }

  public Integer getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(Integer connectionId) {
    this.connectionId = connectionId;
  }

  public String getSearchBase() {
    return searchBase;
  }

  public void setSearchBase(String searchBase) {
    this.searchBase = searchBase;
  }

  public String getLDAPFilter() {
    return LDAPFilter;
  }

  public void setLDAPFilter(String LDAPFilter) {
    this.LDAPFilter = LDAPFilter;
  }

  public Integer getLDAPServer() {
    return LDAPServer;
  }

  public void setLDAPServer(Integer LDAPServer) {
    this.LDAPServer = LDAPServer;
  }

  public Integer getActiveStatus() {
    return ActiveStatus;
  }

  public void setActiveStatus(Integer activeStatus) {
    ActiveStatus = activeStatus;
  }

  public Integer getOverRideDep() {
    return OverRideDep;
  }

  public void setOverRideDep(Integer overRideDep) {
    OverRideDep = overRideDep;
  }
}
