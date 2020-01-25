class Role {
  constructor(document) {
    this.__document = document;
  }

  /** roleId : Int */
  get roleId() {
    this.__document.roleId;
  }

  /** status : String */
  get status() {
    this.__document.status;
  }
}

module.exports = {
  Role
}