class Role {
  constructor(document) {
    this.__document = document;
  }

  /** The roleId : Int */
  get roleId() {
    this.__document.roleId;
  }
}

module.exports = {
  Role
}