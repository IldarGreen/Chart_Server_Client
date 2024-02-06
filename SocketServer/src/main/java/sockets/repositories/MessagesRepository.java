package sockets.repositories;

import sockets.models.HistoryMessage;
import sockets.models.Message;

import java.util.List;

public interface MessagesRepository extends CrudRepository<Message>{
    Message findLastRoomByAuthor(String author);
    List<HistoryMessage> find30MessagesByChatroomName(String chatroomName);
}
