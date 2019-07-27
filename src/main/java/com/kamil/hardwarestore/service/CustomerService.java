package com.kamil.hardwarestore.service;

import com.kamil.hardwarestore.dao.CustomerRepository;
import com.kamil.hardwarestore.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
