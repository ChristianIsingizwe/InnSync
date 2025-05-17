package com.backend.BIZIMANA_hotelManager.request;

import java.math.BigDecimal;


public class CreateRoomRequest {
    private String roomType;
    private BigDecimal price;
    private Long hotelId;

    public CreateRoomRequest(String roomType, BigDecimal price, Long hotelId) {
        this.roomType = roomType;
        this.price = price;
        this.hotelId = hotelId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }
}
