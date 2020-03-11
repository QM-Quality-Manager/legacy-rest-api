package com.qmplus.v3.api.models.response;

import com.qmplus.v3.api.models.response.ldap.BaseFilter;
import com.qmplus.v3.api.models.response.ldap.FilterAttribute;

import java.util.List;
import java.util.Map;

public class LDAPSettingsResponse {
  public Integer serverCount;
  public String dataSource;
  public List<ServerConnection> connections;

  public static class ServerConnection {
    public List<FilterAttribute> filterAttributeList;
    public boolean useDefaultSearchBase = false;
    public String attributeForUser;
    public String attributeForLastName = "sn";
    public String attributeForFirstName = "givenName";
    public String attributeForFullName = "cn";
    public String attributeForEmail = "mail";
    public String attributeForDepartment = "department";
    public String attributeForMobile = "mobile";
    public String attributeForInitials = "initials";
    public String attributeForDistinguishedName = "distinguishedName";
    public String attributeForDepartmentDisplayName = null;
    public String attributeForUserTypeManager = null;
    public String attributeForUserTypeMapping = "userType";
    public String forceUpdateUserSyncFilter;
    public Integer serverId;
    public String serverName;
    public String systemUser;
    public String systemPassword;
    public String domain;
    public String dn;
    public String defaultSearchBase;
    public String host;
    public String port;
    public int ouSyncOUUsertypeManagerUserTypeID; // Used with ATTRIBUTE_FOR_USERTYPE_MANAGER, to be set to id of the Manager user type
    public String protocol;
    public String ouSyncFilter;
    public String ouSyncOU;
    public String filterScope = null;
    public String overrideUserDep;
    public String forceUserNameLowercase = "1";
    public String overrideEmail = "1";
    public String overrideInactive = "1";
    public List<BaseFilter> baseFilterList;
    public String ouUniqueIdentifierPropertyName = null;
    public int doUserSync = 1;
    public int presetQmPlusParentId = 0;
    public String ouUniqueIdentifierPropertyFormatIsBinary = "0";
    public String userNameScheme = "user"; // Used to set what scheme is used for userName for authentication.
    public Map<String, Integer> attributeUserTypeIdMap = null;
  }
}
