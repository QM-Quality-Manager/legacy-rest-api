const program = require('commander');
const AuthService = require('./lib/auth_service');
const LDAPService = require('./lib/ldap_service');
const fs = require('fs');
const status = require('./lib/commands/status');
const settings = require('./lib/commands/settings');
const query = require('./lib/commands/query');
const departmentQueryById = require('./lib/commands/department_query_by_id');
const departmentQueryByName = require('./lib/commands/department_query_by_name');
const departmentInfoById = require('./lib/commands/department_info_by_id');
const departmentInfoByName = require('./lib/commands/department_info_by_name');
const user = require('./lib/commands/user');

(async () => {
  program
    .version('0.0.1')
    .requiredOption('-u, --username <username>', 'provide a username with LDAP permissions')
    .requiredOption('-p, --password <password>', 'provide a password with LDAP permissions')
    .option('-l, --url <url>', 'override end point', 'https://www.qmplus.com/qmplus/rest')
    .option('-o, --output <file>', 'write output to file');

  // Add the status command
  program
    .command('status <tenant>')
    .description('Retrieve the LDAP status of a tenant')
    .action(status);

  // Add the settings command
  program
    .command('settings <tenant>')
    .description('Retrieve the LDAP settings of a tenant')
    .action(settings);

  // Ad-hoc query
  program
    .command('query <tenant> <searchbase> [filters...]')
    .description('Execute an ad-hoc query against the tenants configured LDAP servers.')
    .action(query);

  // Retrieve sync query results for a given department by id
  program
    .command('department-query-id <tenant> <departmentId>')
    .description('Execute the LDAP queries stored for a specific department by id.')
    .action(departmentQueryById);

  // Retrieve sync query results for a given department by name
  program
    .command('department-query-name <tenant> <departmentName>')
    .description('Execute the LDAP queries stored for a specific department by its name.')
    .action(departmentQueryByName);

  // Retrieve the LDAP information for a department by its department id.
  program
    .command('department-info-id <tenant> <departmentId>')
    .description('Retrieve the ldap filters set up for a specific department by id.')
    .action(departmentInfoById);

  // Retrieve the LDAP information for a department by its department name.
  program
    .command('department-info-name <tenant> <departmentName>')
    .description('Retrieve the ldap filters set up for a specific department by name.')
    .action(departmentInfoByName);

  // Retrieve a specific user information from the LDAP server.
  program
    .command('user <tenant> <username>')
    .description('Retrieve the ldap information about a specified username.')
    .action(user);

  await program.parseAsync(process.argv);
})().then(() => {}).catch(err => console.error(err));
