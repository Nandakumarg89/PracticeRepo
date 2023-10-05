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

import com.cg.BankingApp.models.Account;
import com.cg.BankingApp.services.AccountService;
import com.cg.BankingApp.services.CustomerService;
import com.cg.BankingApp.services.TransactionService;

@RestController
public class AccountController {
	 
	@Autowired
	private AccountService accountservice;
	@Autowired
	private CustomerService customerservice;
	@Autowired
	private TransactionService transactionservice;
	
	@PostMapping("/addAccount")
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		accountservice.addAccount(account);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}
	
	@GetMapping("/getAccount/{accountNumber}")
	public ResponseEntity<Account> getAccountInfo(@PathVariable Long accountNumber){
		Account account = accountservice.getAccountDetails(accountNumber);
		return new ResponseEntity<Account>(account, HttpStatus.OK);

	}
	
	@DeleteMapping("/deleteAccount/{accountNumber}")
	public ResponseEntity<Account> deleteCustomer(@PathVariable Long accountNumber){
		return new ResponseEntity<Account>( HttpStatus.OK);

	}
	
	@PutMapping("/account/{accountNumber}")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account){
		accountservice.updateAccount(account);
		return new ResponseEntity<Account>(account, HttpStatus.OK);

	}
	
	
}
