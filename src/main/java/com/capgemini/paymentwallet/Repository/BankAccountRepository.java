package com.capgemini.paymentwallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.paymentwallet.pojoclasses.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount,Integer>{

}
