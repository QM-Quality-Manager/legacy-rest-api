// {
//   "id": 116,
//   "name": "Norwegian",
//   "status": 2,
//   "locale": "en",
// }
class Language {
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

  /** status : Int */
  get status() {
    return this.__document.status;
  }
  
  /** locale : String */
  get locale() {
    return this.__document.locale;
  }
}

module.exports = {
  Language
}