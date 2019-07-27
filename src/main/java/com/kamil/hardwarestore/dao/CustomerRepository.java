package com.kamil.hardwarestore.dao;

import com.kamil.hardwarestore.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    //getAllCustomers
    //List<Customer>
    //getCustomerById
    //updateCustomer(Customer c)
    //deleteCustomer(Customer c)
}
