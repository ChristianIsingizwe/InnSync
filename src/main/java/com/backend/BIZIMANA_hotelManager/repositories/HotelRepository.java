package com.backend.BIZIMANA_hotelManager.repositories;

import com.backend.BIZIMANA_hotelManager.models.Hotel;
import com.backend.BIZIMANA_hotelManager.request.HotelRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Hotel save(HotelRequest hotel);
}
