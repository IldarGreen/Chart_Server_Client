package sockets.services;

import java.util.List;

import sockets.models.Chatroom;

public interface ChatroomService {
    void createChatroom(Chatroom chatroom);
    List<Chatroom> getAllRooms();
    Chatroom getChatroomByName(String chatroomName);

    Chatroom getLastVisitedChatroom(String chatroomName);
}
