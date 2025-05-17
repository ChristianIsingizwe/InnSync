package com.backend.BIZIMANA_hotelManager.repositories;

import com.backend.BIZIMANA_hotelManager.models.Bookings;
import com.backend.BIZIMANA_hotelManager.request.BookingRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Bookings, Long> {
    Bookings save(BookingRequest booking);
    List<Bookings> getBookingsByUserId(Long userId);
}
