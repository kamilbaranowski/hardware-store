package com.kamil.hardwarestore.model;



import com.kamil.hardwarestore.model.entity.Customer;

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
