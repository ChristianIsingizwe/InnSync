package com.backend.BIZIMANA_hotelManager.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class Hotel {

    @Id
    private Long id;
    private String name;
    private String location;

    public Hotel(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    public Hotel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
