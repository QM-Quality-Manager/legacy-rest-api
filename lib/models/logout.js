class Logout {
  constructor(document) {
    this.__document = document;
  }

  /** message : String */
  get message() {
    return this.__document.message;
  }
}

module.exports = Logout;