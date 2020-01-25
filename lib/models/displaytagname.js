// {
//   "id": 116,
//   "name": "AMU",
//   "localizedText": {
//       "1": "string"
//   }
// }
class DisplayTagName {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.departmentName;
  }

  /** name : String */
  get name() {
    return this.__document.name;
  }

  /** localizedText : Map<Int, String> */
  get localizedText() {
    return this.__document.localizedText;
  }
}

module.exports = {
  DisplayTagName
}