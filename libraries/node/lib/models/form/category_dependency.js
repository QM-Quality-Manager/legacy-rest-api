class CategoryDependency {
  constructor(document) {
    this.__document = document;
  }

  /** dependentFor : Int */
  get dependentFor() {
    return this.__document.dependentFor;
  }

  /** dependentOn : Int */
  get dependentOn() {
    return this.__document.dependentOn;
  }

  /** type : Int */
  get type() {
    return this.__document.type;
  }
}

module.exports = CategoryDependency;