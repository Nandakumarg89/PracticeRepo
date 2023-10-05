package com.cg.BankingApp.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.BankingApp.models.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>, JpaRepository<Account, Integer> {

	Account save(Account account);
	Account update(Account account);
	boolean delete(long accountNumber);
	Optional<Account> get(long accountNumber);
}
