package com.backend.BIZIMANA_hotelManager.controllers;

import com.backend.BIZIMANA_hotelManager.request.CreateRoomRequest;
import com.backend.BIZIMANA_hotelManager.response.ApiResponse;
import com.backend.BIZIMANA_hotelManager.services.rooms.IRoom;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/rooms")
public class RoomController {

    @Autowired
    private  IRoom roomService;

    @PostMapping()
    public ResponseEntity<ApiResponse> createRoom( @RequestBody CreateRoomRequest room) {
        try {
            var newRoom = roomService.addRoom(room);
            return ResponseEntity.ok(new ApiResponse("Successfully added room", newRoom));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Error", HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }
}
