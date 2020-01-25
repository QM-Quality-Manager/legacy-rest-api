// {
//   "id": 116,
//   "name": "Norwegian",
//   "status": 2,
//   "locale": "en",
// }
const { Role } = require('./shared');
const FormLayout = require('./form/form_layout');
const AttachedDocument = require('./form/attach_document');
const ListForm = require('./form/list_form');
const Question = require('./form/question');
const CategoryGroup = require('./form/category_group');
const CategoryDependency = require('./form/category_dependency');

class Form {
  constructor(document) {
    this.__document = document;
  }

  /** formId : Int */
  get formId() {
    return this.__document.formId;
  }

  /** departmentId : Int */
  get departmentId() {
    return this.__document.departmentId;
  }

  /** formName : String */
  get formName() {
    return this.__document.formName;
  }

  /** buttonText : String */
  get buttonText() {
    return this.__document.buttonText;
  }

  /** formTypeId : Int */
  get formTypeId() {
    return this.__document.formTypeId;
  }

  /** formType : String */
  get formType() {
    return this.__document.formType;
  }

  /** formInfo : String */
  get formInfo() {
    return this.__document.formInfo;
  }

  /** formVersion : Int */
  get formVersion() {
    return this.__document.formVersion;
  }

  /** status : Int */
  get status() {
    return this.__document.status;
  }

  /** columns : Int */
  get columns() {
    return this.__document.columns;
  }

  /** anonymity : Int */
  get anonymity() {
    return this.__document.anonymity;
  }

  /** heritage : Boolean */
  get heritage() {
    return this.__document.heritage;
  }

  /** colour : String */
  get colour() {
    return this.__document.colour;
  }
  
  /** orderType : Int */
  get orderType() {
    return this.__document.orderType;
  }

  /** attachedDocuments: List<AttachedDocument> */
  get attachedDocuments() {
    return this.__document.attachedDocuments.map(entry => {
      return new AttachedDocument(entry);
    });
  }  

  /** attachedDocuments: List<Int> */
  get attachedFormIds() {
    this.__document.attachedDocuments;
  }  

  /** attachedList: List<ListForm> */
  get attachedList() {
    return this.__document.attachedList.map(entry => {
      return new ListForm(entry);
    });
  }  

  /** question: List<Question> */
  get question() {
    return this.__document.question.map(entry => {
      return new Question(entry);
    });
  }  

  /** formRole: List<Role> */
  get formRole() {
    return this.__document.formRole.map(entry => {
      return new Role(entry);
    });
  }  

  /** formLayout: List<FormLayout> */
  get formLayout() {
    return this.__document.formLayout.map(entry => {
      return new FormLayout(entry);
    });
  }  

  /** categoryGroup: List<CategoryGroup> */
  get categoryGroup() {
    return this.__document.categoryGroup.map(entry => {
      return new CategoryGroup(entry);
    });
  }

  /** categoryDependency: List<CategoryDependency> */
  get categoryDependency() {
    return this.__document.categoryDependency.map(entry => {
      return new CategoryDependency(entry);
    });
  }  
}

module.exports = Form;