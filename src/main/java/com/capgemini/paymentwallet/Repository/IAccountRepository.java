package com.capgemini.paymentwallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

public interface IAccountRepository extends JpaRepository<BankAccount, Integer> {

	@Query(value = "select ba from BankAccount ba where ba.wallet=?1")
	BankAccount findByWallet(Wallet wallet);

}
