package com.cg.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.BankingApp.services.AccountService;
import com.cg.BankingApp.services.CustomerService;
import com.cg.BankingApp.services.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private AccountService accountservice;
	@Autowired
	private CustomerService customerservice;
	@Autowired
	private TransactionService transactionservice;
	
	//
	/*
	 * @GetMapping("/getTeacherDetails/{id}") public Teacher
	 * getTeacherDetails(@PathVariable("id") int id){ Teacher teacher =
	 * resourceService.getTeacherDetails(id); if(teacher == null) throw new
	 * TeacherNotFoundException();
	 * 
	 * return teacher; }
	 */
}
