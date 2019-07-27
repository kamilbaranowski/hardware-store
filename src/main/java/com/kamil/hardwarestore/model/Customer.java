package com.kamil.hardwarestore.model;


import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Customer() {
    }

    public Customer(String lastName, String firstName, String gender, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.address = address;
    }


    public int getCustomerId() {
        return customerId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }
}
