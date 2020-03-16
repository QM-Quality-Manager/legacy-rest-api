# Qmplus LDAP Command Line Tool

The Qmplus LDAP command line tool is a tool that can help diagnose LDAP issues.

To use this tool you must have a user defined in the target organization that has the system `LDAP` roles specified. Otherwise you will receive and error. This is to ensure only authorized users have access to this information.

```
Usage: qplus-ldap-cli [options] [command]

Options:
  -V, --version                                    output the version number
  -u, --username <username>                        provide a username with LDAP permissions
  -p, --password <password>                        provide a password with LDAP permissions
  -l, --url <url>                                  override end point (default: "https://www.qmplus.com/qmplus/rest")
  -o, --output <file>                              write output to file
  -h, --help                                       output usage information

Commands:
  status <tenant>                                  Retrieve the LDAP status of a tenant
  settings <tenant>                                Retrieve the LDAP settings of a tenant
  query <tenant> <searchbase> [filters...]         Execute an ad-hoc query against the tenants configured LDAP 
                                                   servers.
  department-query-id <tenant> <departmentId>      Execute the LDAP queries stored for a specific department by id.
  department-query-name <tenant> <departmentName>  Execute the LDAP queries stored for a specific department by its 
                                                   name.
  department-info-id <tenant> <departmentId>       Retrieve the ldap filters set up for a specific department by id.
  department-info-name <tenant> <departmentName>   Retrieve the ldap filters set up for a specific department by name.
  user <tenant> <username>                         Retrieve the ldap information about a specified username.
```

The tool supports the folllowing commands.

## Status

The `status` command will retrieve the current LDAP status of a client including the details for each department.

An example that queries the database for a `<organization name>` using the user with `<user name>` and `<password>` to authenticate. Finally the results are writen to the file `results.json`.

```
./qplus-ldap-cli status <organization name> -u <user name> -p <password> -o results.json
```

The command will return results of the following format.

```json
{
  "lastSynchronizedDate": "2020-03-16T01:36:06.016Z",
  "departmentStatuses": [
    {
      "name": "XXXXX",
      "id": 2445,
      "parentId": 1721,
      "active": 1,
      "ldapDistinguishedName": "XXXXX,OU=Organization,DC=acme,DC=local",
      "ldapUniqueIdentifier": "{ba1e4512-33b9-44ef-8a75-097569f48889}",
      "updated": "2020-03-13T13:16:57.550Z"
    }
  ]
}
```

## Settings

The `settings` command will retrieve the current LDAP settings of a client.

An example that queries the database for a `<organization name>` using the user with `<user name>` and `<password>` to authenticate. Finally the results are writen to the file `results.json`.

```
./qplus-ldap-cli settings <organization name> -u <user name> -p <password> -o results.json
```

The command will return results of the following format that contains all the settings for a specific `<organization name>`.

```json
{
  "serverCount": 1,
  "dataSource": "jdbc/XXXXX",
  "connections": [
    {
      "filterAttributeList": [
        {
          "userAttribute": "departmentNumber",
          "depAttribute": "postalAddress"
        }
      ],
      "useDefaultSearchBase": true,
      "attributeForUser": "sAMAccountName",
      "attributeForLastName": "sn",
      "attributeForFirstName": "givenName",
      "attributeForFullName": "cn",
      "attributeForEmail": "mail",
      "attributeForDepartment": "department",
      "attributeForMobile": "mobile",
      "attributeForInitials": "initials",
      "attributeForDistinguishedName": "distinguishedName",
      "attributeForDepartmentDisplayName": null,
      "attributeForUserTypeManager": null,
      "attributeForUserTypeMapping": "businesscategory",
      "forceUpdateUserSyncFilter": null,
      "serverId": 0,
      "serverName": "Standard",
      "systemUser": "XXXXX",
      "systemPassword": "XXXXX",
      "domain": "local",
      "dn": "XXXXX",
      "defaultSearchBase": "XXXXX",
      "host": "XXXXX",
      "port": "636",
      "ouSyncOUUsertypeManagerUserTypeID": 0,
      "protocol": "ldaps",
      "ouSyncFilter": "XXXXX",
      "ouSyncOU": "XXXXX",
      "filterScope": "2",
      "overrideUserDep": null,
      "forceUserNameLowercase": "1",
      "overrideEmail": "1",
      "overrideInactive": "1",
      "baseFilterList": [],
      "ouUniqueIdentifierPropertyName": "objectGUID",
      "doUserSync": 1,
      "presetQmPlusParentId": 0,
      "ouUniqueIdentifierPropertyFormatIsBinary": "0",
      "userNameScheme": "DN",
      "attributeUserTypeIdMap": {
        "leder": 1
      }
    }
  ]
}
```

## Department Query by deparment id or name

The `department-query-id` and `department-query-name` commands allows for executing the `LDAP` queries that are stored on the specified department. This can be used to validate if a departments LDAP queries contain specific users.

An example that queries the database for a `<organization name>` using the user with `<user name>` and `<password>` to authenticate. Finally the results are writen to the file `results.json`.

The first example queries by the department id

```
./qplus-ldap-cli department-query-id <organization name> <searchbase> <department id> -u <user name> -p <password> -o results.json
```

The second example queries by the department name

```
./qplus-ldap-cli department-query-name <organization name> <searchbase> <department name> -u <user name> -p <password> -o results.json
```

The command will execute the query using the specified `<department id>` or `<department name>` provided. The results contains one entry for each of the configured `LDAP` servers, their filter settings and the returned results.

```json
{
  "ldapSearchResults": [
    {
      "results": [
        [
          {
            "key": "whenCreated",
            "value": [
              "20191029082236.0Z"
            ]
          }
        ]
      ],
      "settings": {
        "depNr": 2851,
        "connectionId": 4606,
        "searchBase": "OU=Kunder,DC=ikta,DC=local",
        "activeStatus": 1,
        "overRideDep": 0,
        "ldapfilter": "(&(objectClass=user)(departmentNumber=7020906_1501001))",
        "ldapserver": 0
      }
    }
  ]
}
```

## Department Info by deparment id or name

The `department-info-id` and `department-info-name` commands retrieves all the information related to LDAP stored on a department.

An example that queries the database for a `<organization name>` using the user with `<user name>` and `<password>` to authenticate. Finally the results are writen to the file `results.json`.

The first example queries by the department id

```
./qplus-ldap-cli department-query-id <organization name> <searchbase> <department id> -u <user name> -p <password> -o results.json
```

The second example queries by the department name

```
./qplus-ldap-cli department-query-name <organization name> <searchbase> <department name> -u <user name> -p <password> -o results.json
```

The command will execute the query using the specified `<department id>` or `<department name>` provided. The results contains the `LDAP` information for the selected department and the list of configured `LDAP filter` settings for the department.

```json
{
  "department": {
    "name": "XXXXX",
    "id": 2851,
    "parentId": 2850,
    "active": 1,
    "ldapDistinguishedName": "XXXXX,OU=Organization,DC=ikta,DC=local",
    "ldapUniqueIdentifier": "{8d9f273f-e3ad-4746-b367-7afb8f11b969}",
    "updated": 1584105417546
  },
  "settings": [
    {
      "depNr": 2851,
      "connectionId": 4606,
      "searchBase": "OU=Kunder,DC=ikta,DC=local",
      "activeStatus": 1,
      "overRideDep": 0,
      "ldapfilter": "(&(objectClass=user)(departmentNumber=7020906_1501001))",
      "ldapserver": 0
    }
  ]
}
```

## Retrive LDAP information for a given user

The `user` command retrieves all the `LDAP` information for a given `username`.

An example that queries the database for a `<organization name>` using the user with `<user name>` and `<password>` to authenticate. Finally the results are writen to the file `results.json`.

```
./qplus-ldap-cli user <organization name> <username> -u <user name> -p <password> -o results.json
```

The command will execute the query using the specified `<user name>` provided. The results contains the `LDAP` information for the selected department and the list of configured `LDAP filter` settings for the department.

```json
{
  "department": {
    "name": "XXXXX",
    "id": 2851,
    "parentId": 2850,
    "active": 1,
    "ldapDistinguishedName": "XXXXX,OU=Organization,DC=acme,DC=local",
    "ldapUniqueIdentifier": "{8d9f273f-e3ad-4746-b367-7afb8f11b969}",
    "updated": 1584105417546
  },
  "settings": [
    {
      "depNr": 2851,
      "connectionId": 4606,
      "searchBase": "XXXXX",
      "activeStatus": 1,
      "overRideDep": 0,
      "ldapfilter": "XXXXX",
      "ldapserver": 0
    }
  ]
}
```

