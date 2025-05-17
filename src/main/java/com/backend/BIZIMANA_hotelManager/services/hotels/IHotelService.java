package com.backend.BIZIMANA_hotelManager.services.hotels;

import com.backend.BIZIMANA_hotelManager.models.Hotel;
import com.backend.BIZIMANA_hotelManager.request.HotelRequest;

import java.util.List;

public interface IHotelService {
    List<Hotel> getHotels();
    Hotel getHotelById(Long id );
    Hotel addHotel(HotelRequest hotel);
}
