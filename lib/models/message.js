// {
//   "messageId": 4587,
//   "department": {
//     "departmentId": 1,
//     "departmentRole": []
//   },
//   "messageTextFields": [
//     {
//       "messageTextFieldId": 1,
//       "value": "test new Android,  photo from camera and library"
//     }
//   ],
//   "categoryValues": {
//     "1": [
//       {
//         "categoryId": 25,
//         "value": 1
//       }
//     ]
//   }
// }
const { Department } = require('./department');

class TextField {
  constructor(document) {
    this.__document = document;
  }

  /** messageTextFieldId : Int */
  get messageTextFieldId() {
    return this.__document.messageTextFieldId;
  }

  /** messageTextFieldId : Int */
  get categoryValues() {
    return this.__document.categoryValues;
  }
}

class Message {
  constructor(document) {
    this.__document = document;
  }

  /** messageId : Int */
  get messageId() {
    return this.__document.messageId;
  }

  /** department : Department */
  get department() {
    return new Department(this.__document.department);
  }

  /** The messageTextFields : List<TextField> */
  get messageTextFields() {
    return this.__document.messageTextFields.map(entry => {
      return new TextField(entry);
    });
  }  
}

module.exports = Message;