package com.backend.InnSync.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_seq")
    @SequenceGenerator(name = "hotel_seq")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
}
