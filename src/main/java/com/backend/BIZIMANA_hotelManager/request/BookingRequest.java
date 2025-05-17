package com.backend.BIZIMANA_hotelManager.request;

import java.util.Date;

public class BookingRequest {
    private Date check_in;
    private Date check_out;
    private String status;

    private Long room_id;
    private Long user_id;

    public BookingRequest(Date check_in, Date check_out, String status, Long room_id, Long user_id) {
        this.check_in = check_in;
        this.check_out = check_out;
        this.status = status;
        this.room_id = room_id;
        this.user_id = user_id;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
