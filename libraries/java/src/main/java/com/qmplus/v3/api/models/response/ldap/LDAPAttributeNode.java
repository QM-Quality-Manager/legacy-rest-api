package com.qmplus.v3.api.models.response.ldap;

public class LDAPAttributeNode {
  private String key = null;
  private Object value = null;

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
