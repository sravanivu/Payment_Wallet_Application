package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Exception.IdAlreadyExistsException;
import com.capgemini.paymentwallet.Exception.NotFoundException;
import com.capgemini.paymentwallet.Repository.TransactionRepository;
import com.capgemini.paymentwallet.pojoclasses.BenificiaryDetails;
import com.capgemini.paymentwallet.pojoclasses.BillPayment;
import com.capgemini.paymentwallet.pojoclasses.Transaction;

@Service
public class TransactionService {
	@Autowired(required = true)
	TransactionRepository trepository;

	public Transaction addTransaction(Transaction t) {

		Transaction exisitingTransaction = trepository.findById(t.getTransactionId()).orElse(null);
		if (exisitingTransaction == null) {

			return trepository.save(t);

		} else {
			throw new IdAlreadyExistsException("Transaction of ID =  " + t.getTransactionId() + " already exist!!");
		}
	}

	public Transaction getTransactionByTId(int transactionId) {

		return (trepository.findById(transactionId)
				.orElseThrow(() -> new NotFoundException("No Transaction present with id = " + transactionId)));

	}

	public List<Transaction> getAllTransaction() {

		List<Transaction> existingt = trepository.findAll();
		if (existingt != null) {
			return trepository.findAll();
		} else {

			throw new NotFoundException("Zero Transactions done!!! ");
		}
	}

}
