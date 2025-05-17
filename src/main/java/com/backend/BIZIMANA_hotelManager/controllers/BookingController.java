package com.backend.BIZIMANA_hotelManager.controllers;

import com.backend.BIZIMANA_hotelManager.request.BookingRequest;
import com.backend.BIZIMANA_hotelManager.response.ApiResponse;
import com.backend.BIZIMANA_hotelManager.services.bookings.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/bookings")
public class BookingController {

    @Autowired
    private IBookingService bookingService;

    @PostMapping
    public ResponseEntity<ApiResponse> createBooking( @RequestBody BookingRequest booking) {
        try {
            var newBooking = bookingService.createBooking(booking);
            return ResponseEntity
                    .ok(new ApiResponse("Booking created successfully", newBooking));
        } catch (Exception e) {
            e.printStackTrace();

            String errorMsg = "An error happened: " + e.getMessage();
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse(errorMsg, null));
        }
    }
}
