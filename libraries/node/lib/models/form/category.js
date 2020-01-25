const Document = require('./document');
const Priority = require('./priority');

class Category {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.id;
  }

  /** departmentId : Int */
  get departmentId() {
    return this.__document.departmentId;
  }

  /** name : String */
  get name() {
    return this.__document.name;
  }

  /** status : Int */
  get status() {
    return this.__document.status;
  }

  /** info : String */
  get info() {
    return this.__document.info;
  }

  /** heritage : Boolean */
  get heritage() {
    return this.__document.heritage;
  }

  /** cost : Double */
  get heritage() {
    return this.__document.cost;
  }

  /** document : Document */
  get document() {
    return new Document(this.__document.document);
  }

  /** priority : Priority */
  get priority() {
    return new Priority(this.__document.priority);
  }
}

module.exports = Category;