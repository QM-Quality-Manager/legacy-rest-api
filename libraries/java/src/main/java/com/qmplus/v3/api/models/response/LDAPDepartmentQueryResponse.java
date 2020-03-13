package com.qmplus.v3.api.models.response;

import com.qmplus.v3.api.models.response.ldap.LDAPSearchResult;

import java.util.List;

public class LDAPDepartmentQueryResponse {
  private List<LDAPSearchResult> ldapSearchResults;

  public void setLDAPSearchResults(List<LDAPSearchResult> ldapSearchResults) {
    this.ldapSearchResults = ldapSearchResults;
  }

  public List<LDAPSearchResult> getLdapSearchResults() {
    return ldapSearchResults;
  }
}
