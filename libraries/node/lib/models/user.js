// {
//   "userId": 10000467,
//   "firstName": "Sheetal",
//   "lastName": "Kadwal",
//   "status": 1,
//   "userTypeDepartment": [
//     {
//       "departmentId": 33,
//       "userTypeId": 1
//     },
//     {
//       "departmentId": 1,
//       "userTypeId": 5
//     }
//   ],
//   "userRole": [
//     {
//       "roleId": 81
//     },
//   ]
// },
const { Role } = require('./shared');

class UserTypeDepartment {
  constructor(document) {
    this.__document = document;
  }

  /** The departmentId : Int */
  get departmentId() {
    return this.__document.departmentId;
  }

  /** The userTypeId : Int */
  get userTypeId() {
    return this.__document.userTypeId;
  }
}

class User {
  constructor(document) {
    this.__document = document;
  }

  /** Returns the user Id : Int */
  get userId() {
    return this.__document.userId;
  }

  /** The firstName : String */
  get firstName() {
    return this.__document.firstName;
  }

  /** The lastName : String */
  get lastName() {
    return this.__document.lastName;
  }

  /** The status : Int */
  get status() {
    return this.__document.status;
  }

  /** The userTypeDepartment : List<UserTypeDepartment> */
  get userTypeDepartment() {
    return this.__document.userTypeDepartment.map(entry => {
      return new UserTypeDepartment(entry);
    });
  }

  /** The role : List<Role> */
  get userRole() {
    return this.__document.userRole.map(entry => {
      return new Role(entry);
    });
  }
}

module.exports = User;