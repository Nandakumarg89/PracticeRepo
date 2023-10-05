package com.cg.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BankingApp.models.Customer;
import com.cg.BankingApp.services.AccountService;
import com.cg.BankingApp.services.CustomerService;
import com.cg.BankingApp.services.TransactionService;





@RestController
public class CustomerController {

	@Autowired
	private AccountService accountservice;
	@Autowired
	private CustomerService customerservice;
	@Autowired
	private TransactionService transactionservice;
	
	//Add new Customer
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)  {
		customerservice.addCustomer(customer);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	//Delete customer
	@DeleteMapping("/deleteCustomer/{customerId}")
	public boolean deleteCustomer(@PathVariable long customerId ){
		return this.customerservice.deleteCustomer(customerId);
		
	}
	
	//Update Customer
	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		customerservice.updateCustomer(customer);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		
	}
	
	//Get customer
		@GetMapping("/deleteCustomer/{customerId}")
		public ResponseEntity<Customer> getCustomerDetails(@PathVariable long customerId, Customer customer ){
			customerservice.getCustomerDetails(customerId);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
	
	
	
	
}
