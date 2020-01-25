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
const { Role } = require('./shared');

class UserType {
  constructor(document) {
    this.__document = document;
  }

  /** userTypeId : Int */
  get userTypeId() {
    return this.__document.userTypeId;
  }

  /** userTypeName : String */
  get userTypeName() {
    return this.__document.userTypeName;
  }

  /** status : Int */
  get status() {
    return this.__document.status;
  }
  
  /** userTypeRole : List<Role> */
  get userTypeRole() {
    return this.__document.userTypeRole.map(entry => {
      return new Role(entry);
    });
  }
}

module.exports = {
  UserType
}