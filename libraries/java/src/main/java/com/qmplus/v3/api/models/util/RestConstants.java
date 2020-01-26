package com.qmplus.v3.api.models.util;

/**
 * RestConstants: all constants related to REst web service will be declared
 * here.
 *
 * @author vipul.vohra
 * @author gaurav.chugh
 */
public class RestConstants
{
  public static final String REQUIRED_FIELD_EMPTY = "rest.required.field.empty";

  public static final String AUTH_TOKEN_INVAILD = "auth token is Invaild";

  public static final String DEFAULT_AUTH_TOKEN_KEY = "RANDOMCODE";

  public static final String SUCCESSFULLY_LOGOUT = "Successfully Logout";

  /**
   * TODO: This Hard coded values define for task description and color. it should not to be there.
   * these values need to be come from task and related to task table.
   * needs to be removed after implementation done.
   *
   */

  public static final String TASK_ACTION_COLOR = "#000000";

  /**
   * TODO : This HARDCODED values for themes should not be there.
   * enum needs to be removed after theme implementation done at tenant level
   * the value needs to be come from themes table related to tenant.
   *
   * @author gaurav.chugh
   *
   */
  public enum Themes
  {
    GREEN_THEME(1, "/resources/themes/green.zip"), ORANGE_THEME(2, "/resources/themes/orange.zip");

    private int value;
    private String displayTag;

    public int getValue()
    {
      return value;
    }

    public String getDisplayTag()
    {
      return displayTag;
    }

    private Themes(int value, String displayTag)
    {
      this.value = value;
      this.displayTag = displayTag;
    }

    public static String fromValue(int value)
    {
      for (Themes v : values())
      {
        if (v.getValue() == value)
        {
          return v.getDisplayTag();
        }
      }
      return null;
    }
  }

  /**
   * Custom error codes with custom messages. It will return localised error message, in case client (mobile) needs to show to user.
   * Localised keys/values will be present on client's (mobile) local database
   */
  public enum ErrorCode
  {
    // defined error code over here
    MANDATORY_FIELD_MISSING(400, REQUIRED_FIELD_EMPTY), AUTH_TOKEN_INVAILD(1001, "rest.user.auth.token.invalid"), AUTHENTICATION_FAILURE(
        401, "rest.user.authentication.failure"), SUCCESS(200, "rest.success"), MANDATORY_LANGUAGE_ID(1002, "rest.required.language.id"), INVALID_DATE_FORMAT(
        1003, "invalid date format"), TASK_ID(1004, "rest.required.task.id");

    private int value;

    private String displayTag;

    private ErrorCode(int value, String displayTag)
    {
      this.value = value;
      this.displayTag = displayTag;
    }

    public int getValue()
    {
      return value;
    }

    public String getDisplayTag()
    {
      return displayTag;
    }

    public static ErrorCode fromValue(int value)
    {
      for (ErrorCode v : values())
      {
        if (v.getValue() == value)
        {
          return v;
        }
      }
      return null;
    }
  }

}
