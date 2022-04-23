package com.capgemini.paymentwallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.paymentwallet.pojoclasses.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
