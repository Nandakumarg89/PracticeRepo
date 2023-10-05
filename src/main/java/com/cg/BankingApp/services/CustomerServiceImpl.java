package com.cg.BankingApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.cg.BankingApp.models.Customer;
import com.cg.BankingApp.repositorys.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
    private CustomerRepository customerRepository;
	
	
	@Override
	public ResponseEntity<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer newCustomer = customerRepository.save(customer);
    	return null;
		
	}

	@Override
	public boolean deleteCustomer(long customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResponseEntity<Customer> updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerDetails(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
