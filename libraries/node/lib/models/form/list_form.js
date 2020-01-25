class ListForm {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.id;
  }

  /** name : String */
  get name() {
    return this.__document.name;
  }

  /** id : Int */
  get formId() {
    return this.__document.formId;
  }

  /** departmentId : Int */
  get departmentId() {
    return this.__document.departmentId;
  }
}

module.exports = ListForm;