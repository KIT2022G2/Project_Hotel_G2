package com.edu.multicampus.Controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.edu.multicampus.Model.Customer;
import com.edu.multicampus.Services.CustomerService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
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
    void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }
    
    @PutMapping("/customer/{id}")
    void updateCustomer(@PathVariable long id, @RequestBody Customer customer) {
    	customerService.updateCustomer(id, customer);
    }
    
    @DeleteMapping("/customer/{id}")
    void deleteCustomer(@PathVariable long id){
        customerService.deleteCustomer(id);
    }
}
