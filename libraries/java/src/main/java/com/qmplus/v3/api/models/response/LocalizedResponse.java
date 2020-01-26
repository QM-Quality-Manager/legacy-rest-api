package com.qmplus.v3.api.models.response;

import java.util.HashMap;
import java.util.Map;

/**
 * LocalizedResponse should give localized text for mobile app.
 *
 * THIS class will generate JSON out for LocalizedRequest .
 *
 * @author gaurav.chugh
 *
 */
public class LocalizedResponse
{
  private Integer id;

  private String name;

  // LanguageId -> Text value for that language.
  private Map<Integer, String> localizedText = new HashMap<Integer, String>();

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

  public Map<Integer, String> getLocalizedText()
  {
    return localizedText;
  }

  public void setLocalizedText(Map<Integer, String> localizedText)
  {
    this.localizedText = localizedText;
  }

  public void addTextValue(int languageId,String textValue)
  {
    localizedText.put(languageId,textValue);
  }
}
