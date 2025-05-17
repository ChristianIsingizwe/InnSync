package com.backend.BIZIMANA_hotelManager.models;

import jakarta.persistence.*;


import java.math.BigDecimal;


@Entity

public class Room {
    @Id
    private Long id;
    private String room_type;
    private BigDecimal price;
    private Boolean is_available;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    public Room(Long id, String room_type, BigDecimal price, Boolean is_available, Hotel hotel) {
        this.id = id;
        this.room_type = room_type;
        this.price = price;
        this.is_available = is_available;
        this.hotel = hotel;
    }

    public Room() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getIs_available() {
        return is_available;
    }

    public void setIs_available(Boolean is_available) {
        this.is_available = is_available;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
