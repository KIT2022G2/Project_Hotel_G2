package com.edu.multicampus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.edu.multicampus.Model.Customer;
import com.edu.multicampus.Services.CustomerService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    
    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
    	return customerService.getAllCustomer();
    }
    
    @GetMapping("/customer/{id}")
    Optional<Customer> getCustomerById(@PathVariable long id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }
    
    @PutMapping("/customer/{id}")
    public void updateCustomer(@PathVariable long id, @RequestBody Customer customer) {
    	customerService.updateCustomer(id, customer);
    }
    
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable long id){
        customerService.deleteCustomer(id);
    }
    
}
