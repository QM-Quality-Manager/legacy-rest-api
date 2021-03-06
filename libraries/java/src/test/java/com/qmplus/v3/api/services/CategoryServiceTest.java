package com.qmplus.v3.api.services;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.response.CategoryGroupResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

@Disabled
public class CategoryServiceTest extends BaseTest {
  public CategoryServiceTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("List all categories")
  void listCategories() throws IOException {
    CategoryService service = new CategoryService();
    List<CategoryGroupResponse> results = service
        .categories(getAuthTokenKey(), getTenant(), getLanguageId(), getLanguageId(), null, null);
    System.out.println();
  }
}
