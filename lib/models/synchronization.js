class Synchronization {
  constructor(document) {
    this.__document = document;
  }

  /** statusUsers : Boolean */
  get statusUsers() {
    return this.__document.statusUsers;
  }

  /** statusForms : Boolean */
  get statusForms() {
    return this.__document.statusForms;
  }

  /** statusCategories : Boolean */
  get statusCategories() {
    return this.__document.statusCategories;
  }

  /** statusPriorities : Boolean */
  get statusPriorities() {
    return this.__document.statusPriorities;
  }

  /** statusDepartments : Boolean */
  get statusDepartments() {
    return this.__document.statusDepartments;
  }

  /** statusTasks : Boolean */
  get statusTasks() {
    return this.__document.statusTasks;
  }
}

module.exports = Synchronization;