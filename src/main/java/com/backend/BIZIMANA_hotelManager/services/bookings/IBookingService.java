package com.backend.BIZIMANA_hotelManager.services.bookings;

import com.backend.BIZIMANA_hotelManager.models.Bookings;
import com.backend.BIZIMANA_hotelManager.request.BookingRequest;

import java.util.List;

public interface IBookingService {
    Bookings createBooking(BookingRequest booking);
    List<Bookings> getAllUsersBookings(Long userId);
    Bookings getBookingById(Long id);
    void deleteBooking(Long id);
}
