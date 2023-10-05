package com.cg.BankingApp.services;

import org.springframework.http.ResponseEntity;

import com.cg.BankingApp.models.Customer;

public interface CustomerService {

	//Customer addCustomer(long customerId, String name, List<Account> accounts, String address, long phoneNo, String emailId) throws CustomerAlreadyExistsException;

		ResponseEntity<Customer> addCustomer(Customer customer);

		boolean deleteCustomer(long customerId) ;

		ResponseEntity<Customer> updateCustomer(Customer customer) ;

		Customer getCustomerDetails(Long id) ;
}
