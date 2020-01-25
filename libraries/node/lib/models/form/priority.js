class Priority {
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

  /** color : String */
  get color() {
    return this.__document.color;
  }
}

module.exports = Priority;