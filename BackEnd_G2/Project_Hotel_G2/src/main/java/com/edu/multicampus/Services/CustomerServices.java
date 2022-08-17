package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.edu.multicampus.Model.Customer;


public class CustomerServices {

	public interface CustomerService {
	    List<Customer> getAllCustomer();

	    Optional<Customer> getCustomerById(long id);
	    void addCustomer(Customer customer);
	    void updateCustomer(long id, Customer customer);
	    void deleteCustomer(long id);
	}
}
