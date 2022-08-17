package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.edu.multicampus.Model.Customer;


public class CustomerService {

	public interface CustomerServices {
	    List<Customer> getAllCustomer();

	    Optional<Customer> getCustomerById(long id);
	    void addCustomer(Customer customer);
	    void updateCustomer(long id, Customer customer);
	    void deleteCustomer(long id);
	}
}
