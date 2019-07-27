package com.kamil.hardwarestore.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @Column(name = "address_id")
    private int addressId;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "city")
    private String city;

    @Column(name = "building_number")
    private int buildingNumber;

    @Column(name = "apartment_number")
    private int apartmentNumber;

    public Address(){}

}
