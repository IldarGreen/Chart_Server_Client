
*Takeaways: Today you will implement the basic mechanism of a client/server application based on Java—Sockets API*

To make our application fully-featured, let's add the concept of "chatrooms" to it. Each chatroom can have a certain set of users. The chatroom contains a set of messages from participating users.

Each user can:
1.	Create a chatroom
2.	Choose a chatroom
3.	Send a message to a chatroom
4.	Leave a chatroom

When the user re-enters the application, 30 last messages shall be displayed in the room the user visited previously.


Using JSON format for message exchange will be a special task for you. In this way, each user command or message must be transferred to the server (and received from the server) in the form of a JSON line.

For example, a command for sending a message may look as follows (specific contents of messages are at the discretion of a developer):



mvn clean
mvn install

#server
#java -jar SocketServer/target/socket-server.jar --port=8081

#client
#java -jar SocketClient/target/socket-client.jar --server-port=8081
