const AnswerOption = require('./answer_option');

class Answer {
  constructor(document) {
    this.__document = document;
  }

  /** id : Int */
  get id() {
    return this.__document.id;
  }

  /** answer : String */
  get answer() {
    return this.__document.answer;
  }

  /** answerOptions: List<AnswerOption> */
  get answerOptions() {
    return this.__document.answerOptions.map(entry => {
      return new AnswerOption(entry);
    });
  }  
}

module.exports = Answer;