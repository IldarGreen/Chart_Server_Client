The project presents implement the basic mechanism of a client/server application based on Java—Sockets API.

All data about created users, chats and messages is stored in the database

The client and server communicate using JSON format.

Building the project:
`mvn install`.

Запуск Сервера:
`java -jar SocketServer/target/socket-server.jar --port=8081`

Запуск клиентов:
`java -jar SocketClient/target/socket-client.jar --server-port=8081`