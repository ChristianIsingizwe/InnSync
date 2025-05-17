package com.backend.BIZIMANA_hotelManager.controllers;

import com.backend.BIZIMANA_hotelManager.request.HotelRequest;
import com.backend.BIZIMANA_hotelManager.response.ApiResponse;
import com.backend.BIZIMANA_hotelManager.services.hotels.IHotelService;
import com.backend.BIZIMANA_hotelManager.services.rooms.IRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/hotels")

public class HotelController {

    @Autowired
    private  IHotelService hotelService;
    @Autowired
    private  IRoom roomService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addHotel( @RequestBody HotelRequest hotelRequest) {
        try {
            var newHotel = hotelService.addHotel(hotelRequest);
            return ResponseEntity.ok(new ApiResponse("Created successfully",newHotel));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Error", HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllHotels() {
        try {
           var Hotels = hotelService.getHotels();
            return ResponseEntity.ok(new ApiResponse("All hotels: ", Hotels));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Error", HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getHotelById( @PathVariable Long id) {
        try {
           var Hotel = hotelService.getHotelById(id);
           if (Hotel == null) {
               return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Hotel not found", HttpStatus.NOT_FOUND));
           }
           return ResponseEntity.ok(new ApiResponse("Hotel found", Hotel));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Error", HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }

    @GetMapping("/{id}/rooms")
    public ResponseEntity<ApiResponse> getRoomsInHotel( @PathVariable Long id){
        try {
           var roomsInHotel = roomService.getAllRoomsInHotel(id);
           return ResponseEntity.ok(new ApiResponse("Rooms: ", roomsInHotel));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Error", HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }
}
