class Login {
  constructor(document) {
    this.__document = document;
  }

  /** userId : Int */
  get userId() {
    return this.__document.userId;
  }

  /** lastName : String */
  get lastName() {
    return this.__document.lastName;
  }

  /** middleName : String */
  get middleName() {
    return this.__document.middleName;
  }

  /** firstName : String */
  get firstName() {
    return this.__document.firstName;
  }

  /** username : String */
  get username() {
    return this.__document.username;
  }

  /** email : String */
  get email() {
    return this.__document.email;
  }

  /** authTokenKey : String */
  get authTokenKey() {
    return this.__document.authTokenKey;
  }

  /** languageId : Int */
  get languageId() {
    return this.__document.languageId;
  }

  /** contactNumber : String */
  get contactNumber() {
    return this.__document.contactNumber;
  }

  /** tenantId : Int */
  get tenantId() {
    return this.__document.tenantId;
  }

  /** tenantName : String */
  get tenantName() {
    return this.__document.tenantName;
  }

  /** mobileAccess : Int */
  get mobileAccess() {
    return this.__document.mobileAccess;
  }

  /** rememberPasswordPreference : Int */
  get rememberPasswordPreference() {
    return this.__document.rememberPasswordPreference;
  }

  /** themeId : Int */
  get themeId() {
    return this.__document.themeId;
  }

  /** themePath : String */
  get themePath() {
    return this.__document.themePath;
  }

  /** actionTimePreference : Int */
  get actionTimePreference() {
    return this.__document.actionTimePreference;
  }

  /** serverLocation : String */
  get serverLocation() {
    return this.__document.serverLocation;
  }
}

module.exports = Login;