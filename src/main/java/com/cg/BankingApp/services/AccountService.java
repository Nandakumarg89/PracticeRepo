package com.cg.BankingApp.services;

import java.util.List;

import com.cg.BankingApp.models.Account;


public interface AccountService {

	Account addAccount(Account account);
	boolean deleteAccount(int accountNumber);
	Account getAccountDetails(Long accountNumber);
	List<Account> getAllAccountDetails();
	double withdraw(long accountNumber,double amount);
	double deposit(long accountNumber,double amount);
	double getBalance(long accountNUmber);
	boolean fundTransfer(long accountNumberFrom,long accountNumberTo,double amount);
	void updateAccount(Account account);
}
