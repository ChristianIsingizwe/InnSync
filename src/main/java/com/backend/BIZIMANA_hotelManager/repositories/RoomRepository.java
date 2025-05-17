package com.backend.BIZIMANA_hotelManager.repositories;

import com.backend.BIZIMANA_hotelManager.models.Room;
import com.backend.BIZIMANA_hotelManager.request.CreateRoomRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Room save(CreateRoomRequest room);
    Optional<Room> findById(Long id);
}
