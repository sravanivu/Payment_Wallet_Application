package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.TransactionRepository;
import com.capgemini.paymentwallet.pojoclasses.Transaction;

@Service
public class TransactionService {
	@Autowired
	TransactionRepository trepository;

	public Transaction addTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return trepository.save(t);
	}

	public Transaction getTransactionByTId(int transactionId) {
		// TODO Auto-generated method stub
		return trepository.findById(transactionId).get();
	}

	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return trepository.findAll();
	}
	

}
