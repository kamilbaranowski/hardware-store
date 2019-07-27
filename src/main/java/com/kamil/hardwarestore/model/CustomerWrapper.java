package com.kamil.hardwarestore.model;



import java.util.List;


public class CustomerWrapper {

    private List<Customer> customers;


    public CustomerWrapper(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
