package com.cg.BankingApp.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.BankingApp.models.Account;
import com.cg.BankingApp.models.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Account, Integer>, JpaRepository<Account, Integer> {

	Customer save(Customer customer);
	Customer update(Customer customer);
	boolean delete(long accountNumber);
	Optional<Customer> get(long customerId);
}
