package com.maniam.linkedIn.learning.roomwebapp.service;

import com.maniam.linkedIn.learning.roomwebapp.data.RoomRepository;
import com.maniam.linkedIn.learning.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() { return roomRepository.findAll(); }
}
