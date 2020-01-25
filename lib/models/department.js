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

class Department {
  constructor(document) {
    this.__document = document;
  }

  /** departmentName : String */
  get departmentName() {
    return this.__document.departmentName;
  }

  /** status : Int */
  get status() {
    return this.__document.status;
  }

  /** parent : Int */
  get parent() {
    return this.__document.parent;
  }
  
  /** departmentRole : List<Role> */
  get departmentRole() {
    return this.__document.departmentRole.map(entry => {
      return new Role(entry);
    });
  }
}

module.exports = Department;