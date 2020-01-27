package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.LanguageResponse;
import com.qmplus.v3.api.models.response.LocalizedResponse;
import com.qmplus.v3.api.models.response.ResponseWrapperList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

@Disabled
public class LocalizationServiceTest extends BaseTest {
  public LocalizationServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all languages")
  void listLanguages() throws IOException {
    LocalizationService service = new LocalizationService();
    List<LanguageResponse> results = service
        .languages(getAuthTokenKey(), getTenant(), null);
    System.out.println();
  }

  @Test
  @DisplayName("List all displayTagNames")
  void displayTagNames() throws IOException {
    LocalizationService service = new LocalizationService();
    List<LocalizedResponse> results = service
        .displayTagNames(null, null);
    System.out.println();
  }
}
