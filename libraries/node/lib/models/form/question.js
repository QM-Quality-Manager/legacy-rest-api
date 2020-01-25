const Answer = require('./answer');

class Question {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.id;
  }

  /** question : String */
  get question() {
    return this.__document.question;
  }

  /** typeId : Int */
  get typeId() {
    return this.__document.typeId;
  }

  /** formatId : Int */
  get formatId() {
    return this.__document.formatId;
  }

  /** format : String */
  get format() {
    return this.__document.format;
  }

  /** type : String */
  get type() {
    return this.__document.type;
  }

  /** departmentId : Int */
  get departmentId() {
    return this.__document.departmentId;
  }

  /** parentControl : String */
  get parentControl() {
    return this.__document.parentControl;
  }

  /** position : Int */
  get position() {
    return this.__document.position;
  }

  /** info : String */
  get info() {
    return this.__document.info;
  }

  /** answers: List<Answer> */
  get answers() {
    return this.__document.answers.map(entry => {
      return new Answer(entry);
    });
  }  
}

module.exports = Question;