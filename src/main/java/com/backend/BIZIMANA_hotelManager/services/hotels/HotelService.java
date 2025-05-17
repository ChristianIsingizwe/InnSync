package com.backend.BIZIMANA_hotelManager.services.hotels;

import com.backend.BIZIMANA_hotelManager.Exceptions.ResourceNotFoundException;
import com.backend.BIZIMANA_hotelManager.models.Hotel;
import com.backend.BIZIMANA_hotelManager.repositories.HotelRepository;
import com.backend.BIZIMANA_hotelManager.request.HotelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IHotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel not found"));
    }

    @Override
    public Hotel addHotel(HotelRequest hotel) {
        return hotelRepository.save(hotel);
    }
}
