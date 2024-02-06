The project presents implement the basic mechanism of a client/server application based on Java—Sockets API.

All data about created users, chats and messages is stored in the database

The clients and server communicate using JSON format.

Building the project:
`mvn install`.

Starting the Server:
`java -jar SocketServer/target/socket-server.jar --port=8081`

Client launch:
`java -jar SocketClient/target/socket-client.jar --server-port=8081`