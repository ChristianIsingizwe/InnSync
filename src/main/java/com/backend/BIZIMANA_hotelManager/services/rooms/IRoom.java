package com.backend.BIZIMANA_hotelManager.services.rooms;

import com.backend.BIZIMANA_hotelManager.models.Room;
import com.backend.BIZIMANA_hotelManager.request.CreateRoomRequest;

import java.util.List;

public interface IRoom {
    List<Room> getAllRoomsInHotel(Long hotelId);
    Room addRoom(CreateRoomRequest room);
    void deleteRoom(Long roomId);
    Room getRoomById(Long roomId);

}
