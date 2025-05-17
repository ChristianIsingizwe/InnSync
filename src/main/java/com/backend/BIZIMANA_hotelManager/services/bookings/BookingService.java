package com.backend.BIZIMANA_hotelManager.services.bookings;

import com.backend.BIZIMANA_hotelManager.models.Bookings;
import com.backend.BIZIMANA_hotelManager.repositories.BookingRepository;
import com.backend.BIZIMANA_hotelManager.request.BookingRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements IBookingService {

    @Autowired
    private  BookingRepository bookingRepository;

    @Override
    public Bookings createBooking(BookingRequest booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Bookings> getAllUsersBookings(Long userId) {
        return bookingRepository.getBookingsByUserId(userId);
    }

    @Override
    public Bookings getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    public List<Bookings> getAllBookings() {
        return bookingRepository.findAll();
    }
}
