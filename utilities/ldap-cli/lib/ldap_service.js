const BaseService = require('./service');

class LDAPService extends BaseService {
  constructor(endpoint) {
    super(endpoint);
  }

  /**
   * Perform an ad-hoc query to the configured LDAP servers allowing you to test queries.
   * @param authTokenKey The user's authTokenKey
   * @param tenant The user's tenant (organization name)
   * @param searchbase The LDAP query searchbase.
   * @param filters A list of filters to apply to the query.
   * @returns Status
   */
  async query(authTokenKey, tenant, searchbase, filters) {
    let result = await this.executeOperation("/ldap/query", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile",
      searchBase: searchbase,
      filters: filters
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to execute the ldap query for tenant ${tenant}`);
    }    
  }

  /**
   * Retrieve the ldap status for a tenant
   * @param authTokenKey The user's authTokenKey
   * @param tenant The user's tenant (organization name)
   * @returns Status
   */
  async status(authTokenKey, tenant) {
    let result = await this.executeOperation("/ldap/status", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile"
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to retrieve ldap status for tenant ${tenant}`);
    }    
  }

  /**
   * Retrieve the ldap settings for a tenant
   * @param authTokenKey The user's authTokenKey
   * @param tenant The user's tenant (organization name)
   * @returns Status
   */
  async settings(authTokenKey, tenant) {
    let result = await this.executeOperation("/ldap/settings", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile"
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to retrieve ldap settings for tenant ${tenant}`);
    }    
  }

  /**
   * Retrieve LDAP attributes for a user
   * @param authTokenKey The user's authTokenKey
   * @param tenant The tenant (organization name)
   * @param username The username we want to check
   * @returns UserStatus
   */
  async ldapUser(authTokenKey, tenant, username) {
    let result = await this.executeOperation("/ldap/user/ldap", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile",
      username: username
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to retrieve ldap status for tenant ${tenant} and user ${username}`);
    }    
  }

  /**
   * Retrieve LDAP information for a given department by department id.
   * @param authTokenKey The user's authTokenKey
   * @param tenant The tenant (organization name)
   * @param departmentId The departmentId we want to check
   * @returns UserStatus
   */
  async departmentInfoById(authTokenKey, tenant, departmentId) {
    let result = await this.executeOperation("/ldap/department/info", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile",
      id: departmentId
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to retrieve ldap status for tenant ${tenant} and department ${departmentId}`);
    }    
  }

  /**
   * Retrieve LDAP information for a given department by department name.
   * @param authTokenKey The user's authTokenKey
   * @param tenant The tenant (organization name)
   * @param name The name we want to check
   * @returns UserStatus
   */
  async departmentInfoByName(authTokenKey, tenant, name) {
    let result = await this.executeOperation("/ldap/department/info", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile",
      name: name
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to retrieve ldap status for tenant ${tenant} and department ${name}`);
    }    
  }

  /**
   * Retrieve LDAP results from the departments LDAP filters by department id.
   * @param authTokenKey The user's authTokenKey
   * @param tenant The tenant (organization name)
   * @param departmentId The departmentId we want to check
   * @returns UserStatus
   */
  async departmentQueryById(authTokenKey, tenant, departmentId) {
    let result = await this.executeOperation("/ldap/department/query", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile",
      id: departmentId
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to retrieve ldap status for tenant ${tenant} and department ${departmentId}`);
    }    
  }

  /**
   * Retrieve LDAP results from the departments LDAP filters by department name.
   * @param authTokenKey The user's authTokenKey
   * @param tenant The tenant (organization name)
   * @param name The departmentId we want to check
   * @returns UserStatus
   */
  async departmentQueryByName(authTokenKey, tenant, name) {
    let result = await this.executeOperation("/ldap/department/query", {
      authTokenKey: authTokenKey,
      tenant: tenant,
      clientInfo: "mobile",
      name: name
    });

    if (result) {
      return result.content;
    } else {
      throw Error(`failed to retrieve ldap status for tenant ${tenant} and department ${name}`);
    }    
  }
}

module.exports = LDAPService;