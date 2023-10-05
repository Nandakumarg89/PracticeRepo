package com.cg.BankingApp.services;

import com.cg.BankingApp.models.Transaction;

public interface TransactionService {

	void addTransacation(Transaction transaction);
	Transaction getTransactionDetails(int transId);
}
