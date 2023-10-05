package com.cg.BankingApp.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.BankingApp.models.Account;
import com.cg.BankingApp.models.Transaction;


@Repository
public interface TransactionRepository extends CrudRepository<Account, Integer>, JpaRepository<Account, Integer> {

	Transaction save(Transaction transaction);
	Transaction update(Transaction transaction);
	boolean delete(long accountNumber);
	Optional<Transaction> get(long transactionID);
}
