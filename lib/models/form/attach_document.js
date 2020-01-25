class AttachedDocument {
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
  
  /** link : String */
  get link() {
    return this.__document.link;
  }

  /** type : String */
  get type() {
    return this.__document.type;
  }

  /** heritage : Boolean */
  get heritage() {
    return this.__document.heritage;
  }

  /** departmentId : Int */
  get departmentId() {
    return this.__document.departmentId;
  }
}

module.exports = AttachedDocument;