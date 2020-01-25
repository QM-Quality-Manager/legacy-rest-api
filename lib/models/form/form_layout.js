class FormLayout {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.id;
  }

  /** controlType : String */
  get controlType() {
    return this.__document.controlType;
  }

  /** optional : Int */
  get optional() {
    return this.__document.optional;
  }

  /** position : Int */
  get position() {
    return this.__document.position;
  }

  /** template : Int */
  get template() {
    return this.__document.template;
  }

  /** parentControl : String */
  get parentControl() {
    return this.__document.parentControl;
  }

  /** labelText : String */
  get labelText() {
    return this.__document.labelText;
  }

  /** rows : Int */
  get rows() {
    return this.__document.rows;
  }

  /** columns : Int */
  get columns() {
    return this.__document.columns;
  }

  /** validationType : String */
  get validationType() {
    return this.__document.validationType;
  }

  /** instructions : String */
  get instructions() {
    return this.__document.instructions;
  }

  /** entityType : Int */
  get entityType() {
    return this.__document.entityType;
  }

  /** required : Int */
  get required() {
    return this.__document.required;
  }

  /** hidden : Int */
  get columhiddenns() {
    return this.__document.hidden;
  }

  /** encrypted : Int */
  get encrypted() {
    return this.__document.encrypted;
  }

  /** maxLength : Int */
  get maxLength() {
    return this.__document.maxLength;
  }
}

module.exports = FormLayout;