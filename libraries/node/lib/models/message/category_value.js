// {
//   "departmentId": 116,
//   "departmentName": "AMU",
//   "status": 2,
//   "parent": 1,
//   "departmentRole": [
//     {
//       "roleId": 19
//     }
//   }
// }
class CategoryValue {
  constructor(document) {
    this.__document = document;
  }

  /** categoryId : Int */
  get categoryId() {
    return this.__document.categoryId;
  }

  /** value : Double */
  get value() {
    return this.__document.value;
  }
}

module.exports = CategoryValue;