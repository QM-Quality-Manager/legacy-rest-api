# Quality Manager V3 API Integration
The Quality Manager V3 API is limited to mostly read operations for messages. There is an ability to register messages using the API but it requires a deep understanding of how the data model is built in V3. We do not recommend users use the creation API for messages without contacting us at `support at qmplus dot com`.

## API overview

The root url for the API is.

`https://www.qmplus.com/qmplus/rest`

The following endpoints HTTP endpoints exist under the root url.

| Root | Endpoint | Description |
| --- | --- | --- |
| `/user` | `/login` | Used to login in with a user and password and retrieve user details as well as the `authKeyToken`. |
| `/user` | `/logout` | Used to logout a current user and `authKeyToken`. |
| `/user` | `/users` | List the users. |
| `/local` | `/languages` | List the application languages. |
| `/local` | `/displayTagNames` | List the application display tag names. |
| `/msg` | `/save` | Register a new message. |
| `/msg` | `/uploadImage` | Upload an image to an existing message. |
| `/msg` | `/messageList` | Search for messages using a set of available criteria. |
| `/sync` | `/departments` | List the departments available for a tenant. |
| `/sync` | `/formList` | List the message forms available for a tenant. |
| `/sync` | `/userTypes` | List the user types available for a tenant. |
| `/sync` | `/categories` | List the categories available for a tenant. |
| `/sync` | `/priorities` | List the priorities available for a tenant. |
| `/sync` | `/assets` | Query the current synchronization status of a tenant given a specific date. |
| `/task` | `/taskList` | List the tasks available for a tenant. |
| `/task` | `/done` | Set a specific task to done. |

## Build The Java API Library

The Java Library is a wrapper around the HTTP API endpoints. It is built using `Gradle`.

To build the library open a terminal and go to the directory `libraries/java`. Then run the gradle script.

```
./gradlew jar
```

This will grab all dependencies and attempt to build the library. The final artefact can be found under `libraries/java/build/libs`.

The required runtime dependencies for this library are.

```
org.apache.commons:commons-math3:3.6.1
com.fasterxml.jackson.core:jackson-databind:2.10.1
```

The Java library contains the following services.

| Service | Description |
| --- | --- |
| `AuthenticastionService` | Handle the login and logout of a user. |
| `CategoryService` | Retrieve a tenant's categories. |
| `DepartmentService` | Retrieve a tenant's departments. |
| `FormService` | Retrieve a tenant's forms. |
| `LocalizationService` | Retrieve a tenant's languages and displayTagNames. |
| `MessageService` | Create a message, upload images to a message and list existing messages for a tenant. |
| `PriorityService` | Retrieve a tenant's priorities. |
| `TaskService` | Retrieve a tenant's tasks and mark a task as done. |
| `UserService` | Retrieve a tenant's users and userTypes. |
| `SynchronizationService` | Retrieve a tenant's current synchronization status. |

## Run Java Test Cases

All testcases are `@Disabled` by default, so you have to remove the annotation `@Disabled` to be able run run any. You also have to set up a property file with the details you need to test the API. This wil needs to be created in the following directory.

`libraries/java/src/test/resources/credentials.properties`

It should contain the following properties.

```
tenant=<TENANT NAME, THE ONE YOU USE TO LOGIN>
username=<YOUR USERNAME>
userId=<YOUR USERID>
languageId=<USER LANGUAGE ID>
password=<YOUR USERNAME PASSWORD>
authTokenKey=<A VALID USER AUTHTOKENKEY>
```

Lets go through how we can get the needed properties. We need to login with a user and from the returned result we can extract the `userId`, `authTokenKey` and `languageId`. You can do this using the following Java Code.

```java
AuthenticationService service = new AuthenticationService();
LoginResponse login = service.login("<TENANTNAME>", "<USERNAME>", "<PASSWORD>", null);
System.out.println("authTokenKey = " + login.getAuthTokenKey());
System.out.println("userId = " + login.getUserId());
System.out.println("languageId = " + login.getLanguageId());
```

Fill in the properties file with the values you specified and you are ready to go. Note however that some of the tests are dependent on data existing so don't expect the ones that specifically target a named `messageId` or `taskId` to work. They are there more as a reference of valid system call to `Quality Manager`.

## Examples

Make sure you have set up the `credential.properties` file and take a look at the more extensive usage examples written as `Junit 5` tests. These should be able to be run against your target tenant and will deliver results dependent on what has been registered on the platform.

All files can be found at `./src/test/java/com/qmplus/v3/api/examples`.

| Name | File | Description |
| --- | --- | --- |
| Examples of extracting messages | `ExtractDataExampleTest.java` | Contains examples on how to extract `message` data from V3 and what additional data is needed to make sense of the messages retrieved. |