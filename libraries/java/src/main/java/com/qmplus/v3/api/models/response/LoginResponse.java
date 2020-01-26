package com.qmplus.v3.api.models.response;

/**
 * LoginResponse should give object of user login.
 *
 * THIS class will generate JSON out for loginRequest .
 *
 * @author vipul.vohra
 * @author gaurav.chugh
 *
 */
public class LoginResponse
{
  private Integer userId;

  private String lastName;

  private String middleName;

  private String firstName;

  private String username;

  private String email;

  private String authTokenKey;

  private Integer languageId;

  private String contactNumber;

  private Integer tenantId;

  private String tenantName;

  private Integer mobileAccess;

  private Integer rememberPasswordPreference;

  private Integer themeId;

  private String themePath;

  private Integer actionTimePreference;

  private String serverLocation;

  public Integer getUserId()
  {
    return userId;
  }

  public void setUserId(Integer userId)
  {
    this.userId = userId;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public void setMiddleName(String middleName)
  {
    this.middleName = middleName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getAuthTokenKey()
  {
    return authTokenKey;
  }

  public void setAuthTokenKey(String authTokenKey)
  {
    this.authTokenKey = authTokenKey;
  }

  public Integer getLanguageId()
  {
    return languageId;
  }

  public void setLanguageId(Integer languageId)
  {
    this.languageId = languageId;
  }

  public String getContactNumber()
  {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber)
  {
    this.contactNumber = contactNumber;
  }

  public Integer getTenantId()
  {
    return tenantId;
  }

  public void setTenantId(Integer tenantId)
  {
    this.tenantId = tenantId;
  }

  public String getTenantName()
  {
    return tenantName;
  }

  public void setTenantName(String tenantName)
  {
    this.tenantName = tenantName;
  }

  public Integer getMobileAccess()
  {
    return mobileAccess;
  }

  public void setMobileAccess(Integer mobileAccess)
  {
    this.mobileAccess = mobileAccess;
  }

  public Integer getRememberPasswordPreference()
  {
    return rememberPasswordPreference;
  }

  public void setRememberPasswordPreference(Integer rememberPasswordPreference)
  {
    this.rememberPasswordPreference = rememberPasswordPreference;
  }

  public Integer getThemeId()
  {
    return themeId;
  }

  public void setThemeId(Integer themeId)
  {
    this.themeId = themeId;
  }

  public String getThemePath()
  {
    return themePath;
  }

  public void setThemePath(String themePath)
  {
    this.themePath = themePath;
  }

  public Integer getActionTimePreference()
  {
    return actionTimePreference;
  }

  public void setActionTimePreference(Integer actionTimePreference)
  {
    this.actionTimePreference = actionTimePreference;
  }

  /**
   * @return the serverLocation
   */
  public String getServerLocation()
  {
    return serverLocation;
  }

  /**
   * @param serverLocation the serverLocation to set
   */
  public void setServerLocation(String serverLocation)
  {
    this.serverLocation = serverLocation;
  }
}
