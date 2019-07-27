package com.kamil.hardwarestore.controller;


import com.kamil.hardwarestore.model.Customer;
import com.kamil.hardwarestore.model.CustomerWrapper;
import com.kamil.hardwarestore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {


    private CustomerService customerService;


    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public CustomerWrapper getCustomers(){
        return new CustomerWrapper(customerService.getAllCustomers());

    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        this.customerService.saveCustomer(customer);
    }
    @DeleteMapping("/{customerId}")
    public void removeCustomer(@PathVariable("customerId") int customerId){
        this.customerService.deleteCustomer(customerId);
    }

}
