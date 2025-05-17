package com.backend.BIZIMANA_hotelManager.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity

public class Billing {
    @Id
    private Long id;
    private BigDecimal amount;
    private Date generated_at;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "booking_id", nullable = false)
    private Bookings booking;

    public Billing(Long id, BigDecimal amount, Date generated_at, Bookings booking) {
        this.id = id;
        this.amount = amount;
        this.generated_at = generated_at;
        this.booking = booking;
    }

    public Billing() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getGenerated_at() {
        return generated_at;
    }

    public void setGenerated_at(Date generated_at) {
        this.generated_at = generated_at;
    }

    public Bookings getBooking() {
        return booking;
    }

    public void setBooking(Bookings booking) {
        this.booking = booking;
    }
}
