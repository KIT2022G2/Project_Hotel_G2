package com.edu.multicampus.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.multicampus.Model.Customer;
import com.edu.multicampus.Repository.CustomerRepository;
import com.edu.multicampus.Services.CustomerService.CustomerServices;

public class CustomerServiceImpl implements CustomerServices{
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id) ;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(long id, Customer customer) {
		Optional<Customer> optional = customerRepository.findById(id);
		Customer c = null;
		if(optional.isPresent()) {
			c = optional.get();
			c.setCustomerEmail(customer.getCustomerEmail());
			c.setCustomerName(customer.getCustomerName());
			c.setCustomerPassword(customer.getCustomerPassword());
			c.setCustomerUserName(customer.getCustomerUserName());
			customerRepository.save(c);
		}else {
			throw new RuntimeException("Customer not found");
		}
	}

	@Override
	public void deleteCustomer(long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if(optional.isPresent()) {
			this.customerRepository.deleteById(id);
		}else {
			throw new RuntimeException("Customer not found");
		}
	}

	
}
