package com.edu.multicampus.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.edu.multicampus.Model.Customer;


public class CustomerServices {

	public interface CustomerService {
	    List<Customer> getAllCustomer();

	    Page<Customer> getAllCustomerByPage(int pageNo, int pageSize);
	    Optional<Customer> getCustomerById(long id);
	    int addCustomer(Customer customer);
	    int updateCustomer(long id, Customer customer);
	    int deleteCustomer(long id);
	}
}
