class AnswerOption {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.id;
  }

  /** optionName : String */
  get optionName() {
    return this.__document.optionName;
  }

  /** position : Int */
  get position() {
    return this.__document.position;
  }

  /** numbering : Int */
  get numbering() {
    return this.__document.numbering;
  }
}

module.exports = AnswerOption;