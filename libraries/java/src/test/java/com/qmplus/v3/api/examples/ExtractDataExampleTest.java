package com.qmplus.v3.api.examples;

import com.qmplus.v3.api.BaseTest;
import com.qmplus.v3.api.models.request.DepartmentHierarchyRequest;
import com.qmplus.v3.api.models.response.*;
import com.qmplus.v3.api.services.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExtractDataExampleTest extends BaseTest {
  public ExtractDataExampleTest() throws IOException {
    super();
  }

  @Test
  @DisplayName("extract data and associated fields")
  public void extractDataAndAssociatedFields() throws IOException, ParseException {
    // Turn off info logging
    Logger.getLogger(BaseService.class.getName()).setLevel(Level.OFF);

    // Create the needed services
    AuthenticationService authenticationService = new AuthenticationService();
    CategoryService categoryService = new CategoryService();
    PriorityService priorityService = new PriorityService();
    DepartmentService departmentService = new DepartmentService();
    LocalizationService localizationService = new LocalizationService();
    FormService formService = new FormService();
    MessageService messageService = new MessageService();

    // Lets login first
    LoginResponse loginResponse = authenticationService.login(
        getTenant(), getUsername(), getPassword(), "rest-api");

    // Next grab all the needed objects
    List<CategoryGroupResponse> categories = categoryService.categories(
        loginResponse.getAuthTokenKey(), loginResponse.getTenantName(), loginResponse.getLanguageId(),
        loginResponse.getLanguageId(), null, "rest-api");
    List<PriorityResponse> prioities = priorityService.priorities(
        loginResponse.getAuthTokenKey(), loginResponse.getTenantName(), loginResponse.getLanguageId(),
        loginResponse.getLanguageId(), null, "rest-api");
    List<DepartmentHierarchyResponse> departments = departmentService.departments(
        loginResponse.getAuthTokenKey(), loginResponse.getTenantName(), null, "rest-api");
    List<LanguageResponse> languages = localizationService.languages(
        loginResponse.getAuthTokenKey(), loginResponse.getTenantName(), "rest-api");
    List<LocalizedResponse> displayTagNames = localizationService.displayTagNames(
        null, "rest-api");
    List<FormResponse> forms = formService.formList(
        loginResponse.getAuthTokenKey(), loginResponse.getTenantName(), loginResponse.getLanguageId(),
        loginResponse.getLanguageId(), null, "rest-api");

//    forms.forEach(formResponse -> {
////      formResponse.getFormLayout().forEach(formLayoutResponse -> {
////        formLayoutResponse.
////      });
//    });

    // Iterate over all the forms and show the messages for each form
    for (FormResponse formResponse : forms) {
      System.out.println(String.format("form : %s : %s", formResponse.getFormId(), formResponse.getFormName()));

      // Create a query
      MessageService.Query query = new MessageService.Query();
      query.setFromDate(formatter.parse("01-01-2018"));
      query.setToDate(formatter.parse("31-01-2019"));
      query.setFormId(formResponse.getFormId());

      // Get a set of messages
      List<MessageResponse> messages = messageService
          .messageList(getAuthTokenKey(), loginResponse.getTenantName(), loginResponse.getLanguageId(), loginResponse.getLanguageId(), query, null);

      if (messages != null) {
        messages.forEach(messageResponse -> {
          System.out.println();
          System.out.println(String.format("  -- message : %s", messageResponse.getMessageId()));

          System.out.println(String.format("    -- categories"));
          // Print all the categories
          messageResponse.getCategoryValues().entrySet().forEach(entry -> {
            // Locate the category entry
            CategoryResponse category = locateCategory(categories, entry.getKey());
            if (category != null) {
              System.out.println(String.format("      -- category : %s : %s", category.getId(), category.getName()));
            }
          });

          // Locate the Department
          DepartmentHierarchyResponse department = locateDepartment(departments, messageResponse.getDepartment().getDepartmentId());
          if (department != null) {
            System.out.println(String.format("    -- department : %s : %s", department.getDepartmentId(), department.getDepartmentName()));
          }

          System.out.println(String.format("    -- fields"));
          // Print all fields
          for (FormLayoutResponse formLayoutResponse : formResponse.getFormLayout()) {
            for (MessageTextFieldResponse messageTextFieldResponse : messageResponse.getMessageTextFields()) {
              Integer layoutId = formLayoutResponse.getId();
              Integer messageTextFieldId = messageTextFieldResponse.getMessageTextFieldId();

              if (layoutId == messageTextFieldId) {
                System.out.println(String.format("      -- field : %s : %s",
                    formLayoutResponse.getLabelText(), messageTextFieldResponse.getValue()));
              }
            }
          }
        });
      }
    }

    // Logout the user
    LogoutResponse logoutResponse = authenticationService.logout(
        loginResponse.getAuthTokenKey(), loginResponse.getTenantName(), loginResponse.getUserId(), "rest-api");
  }

  private DepartmentHierarchyResponse locateDepartment(List<DepartmentHierarchyResponse> departments, Integer departmentId) {
    for (DepartmentHierarchyResponse department : departments) {
      if (department.getDepartmentId() == departmentId) {
        return department;
      }
    }

    return null;
  }

  private CategoryResponse locateCategory(List<CategoryGroupResponse> categoryGroupResponses, Integer key) {
    for (CategoryGroupResponse categoryGroupResponse : categoryGroupResponses) {
      for (CategoryResponse category: categoryGroupResponse.getCategory()) {
        if (category.getId() == key) {
          return category;
        }
      }
    }

    return null;
  }
}
