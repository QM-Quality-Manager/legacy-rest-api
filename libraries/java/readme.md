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

## Java API Library