class RiskData {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.id;
  }

  /** scale : Int */
  get scale() {
    return this.__document.scale;
  }

  /** dimension : Int */
  get dimension() {
    return this.__document.dimension;
  }

  /** singleDimension : Int */
  get singleDimension() {
    return this.__document.singleDimension;
  }
}

module.exports = RiskData;