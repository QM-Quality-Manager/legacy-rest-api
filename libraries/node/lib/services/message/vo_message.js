class VoCategoryDependency {
  dependencyFor;              // Int
  dependencyOn;               // Int
  dependencyType;             // Int
  frmVersionId;               // Int
  dependencyCategoryGroup;    // Int
}

class VoMessageField {
  messageFieldId;             // Int
  messageFieldType;           // Int
  messageFieldName;           // String
  componentId;                // Int
  componentName;              // String
  position;                   // Int
  containerId;                // Int
  showAs;                     // Int
  displayTagNames;            // Map<Int, String>
  selectedValue;              // Int
  stringValue;                // String
  selectedIds;                // List<Int>
  listOfSelectedIds;          // List<List<Int>>
  maxRows;                    // Int
  maxCols;                    // Int
  isTemplate;                 // Int
  anonymity;                  // Int
  anonymityChecked;           // Boolean
  categoryDependencyList;     // List<VoCategoryDependency>
}

class VoMessage {
  departmentId;               // Int  
  userId;                     // Int
  messageId;                  // Int
  registeredBy;               // Int
  formVersionId;              // Int
  registeredOnBehalf;         // Int
  registeredOn;               // Int
  priorityId;                 // Int
  cost;                       // Double
  caseHandlerId;              // Int
  caseStatusId;               // Int
  textJson;                   // String
  registeredByUsername;       // String
  caseStatusName;             // String
  registered;                 // Long (Date)
  registeredDate;             // Long (Date)
  anonymity;                  // Int
  latitude;                   // Float
  longitude;                  // Float
  messagefileUpload;          // Map<String, String>
  messageFields;              // List<VoMessageField>
}

module.exports = VoMessage;