package com.hybernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int id;
    @Column(name="city")
    private String city;

    private String street;
    @OneToOne
    private Student student;
}
