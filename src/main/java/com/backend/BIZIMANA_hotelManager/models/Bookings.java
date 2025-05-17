package com.backend.BIZIMANA_hotelManager.models;


import jakarta.persistence.*;


import java.util.Date;

@Entity

public class Bookings {
    @Id
    private Long id;
    private Date check_in;
    private Date check_out;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    public Bookings(Long id, Date check_in, Date check_out, String status, User user, Room room) {
        this.id = id;
        this.check_in = check_in;
        this.check_out = check_out;
        this.status = status;
        this.user = user;
        this.room = room;
    }
    public Bookings() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
