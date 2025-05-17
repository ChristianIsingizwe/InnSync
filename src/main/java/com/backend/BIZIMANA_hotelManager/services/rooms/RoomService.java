package com.backend.BIZIMANA_hotelManager.services.rooms;

import com.backend.BIZIMANA_hotelManager.models.Room;
import com.backend.BIZIMANA_hotelManager.repositories.RoomRepository;
import com.backend.BIZIMANA_hotelManager.request.CreateRoomRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoom{

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> getAllRoomsInHotel(Long hotelId) {
        return roomRepository.findAll();
    }

    @Override
    public Room addRoom(CreateRoomRequest room) {
        return roomRepository.save(room);
    }

    @Override
    public void deleteRoom(Long roomId) {
        roomRepository.deleteById(roomId);
    }

    @Override
    public Room getRoomById(Long roomId) {
        return roomRepository.findById(roomId).orElse(null);
    }
}
