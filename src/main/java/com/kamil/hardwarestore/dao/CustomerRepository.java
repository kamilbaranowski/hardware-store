package com.kamil.hardwarestore.dao;

import com.kamil.hardwarestore.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    //getAllCustomers
    //List<Customer>
    //getCustomerById
    //updateCustomer(Customer c)
    //deleteCustomer(Customer c)
}
