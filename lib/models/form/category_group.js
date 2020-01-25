const Document = require('./document');
const RiskData = require('./risk_data');
const Category = require('./category');

class CategoryGroup {
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

  /** type : String */
  get type() {
    return this.__document.type;
  }

  /** parentColumn : String */
  get parentColumn() {
    return this.__document.parentColumn;
  }

  /** heritage : Boolean */
  get heritage() {
    return this.__document.heritage;
  }

  /** position : Int */
  get position() {
    return this.__document.position;
  }

  /** showAs : Int */
  get showAs() {
    return this.__document.showAs;
  }

  /** showInMobile : Int */
  get showInMobile() {
    return this.__document.showInMobile;
  }

  /** mandatory : Int */
  get mandatory() {
    return this.__document.mandatory;
  }

  /** status : Int */
  get status() {
    return this.__document.status;
  }

  /** info : String */
  get info() {
    return this.__document.info;
  }

  /** parent : Int */
  get parent() {
    return this.__document.parent;
  }

  /** departmentId : Int */
  get departmentId() {
    return this.__document.departmentId;
  }

  /** mobileSearch : Boolean */
  get mobileSearch() {
    return this.__document.mobileSearch;
  }

  /** document : Document */
  get document() {
    return new Document(this.__document.document);
  }

  /** riskData : RiskData */
  get riskData() {
    return new RiskData(this.__document.riskData);
  }

  /** category: List<Category> */
  get category() {
    return this.__document.category.map(entry => {
      return new Category(entry);
    });
  }  
}

module.exports = CategoryGroup;