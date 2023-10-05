package com.cg.BankingApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.BankingApp.models.Account;
import com.cg.BankingApp.repositorys.AccountRepository;
import com.cg.BankingApp.repositorys.CustomerRepository;

public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private TransactionService transactionService;
	@Override
	
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
	
		return null;
	}
	@Override
	public boolean deleteAccount(int accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Account getAccountDetails(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double withdraw(long accountNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double deposit(long accountNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getBalance(long accountNUmber) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean fundTransfer(long accountNumberFrom, long accountNumberTo, double amount) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		
	}
}
