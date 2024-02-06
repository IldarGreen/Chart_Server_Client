package sockets.services;


import sockets.models.Chatroom;
import sockets.models.HistoryMessage;
import sockets.models.Message;
import sockets.models.User;
import sockets.repositories.HistoryMessageMapper;

import java.util.List;


public interface UsersService {
    boolean signUp(User user);
    boolean logIn(String username, String password);
    void saveMessage(User user, Chatroom chatroom, String message);
    User getLogUpUser(String username, String password);
    User getLogUpUserOnlyName(String username);

    List<HistoryMessage> getFind30MessagesByChatroomName(String chatroomname);
}
