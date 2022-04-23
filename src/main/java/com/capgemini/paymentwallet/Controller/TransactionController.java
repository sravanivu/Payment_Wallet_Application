package com.capgemini.paymentwallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.TransactionService;
import com.capgemini.paymentwallet.pojoclasses.Transaction;

@RestController
public class TransactionController {
	@Autowired
	TransactionService tservice;
	
	@RequestMapping(value="transaction/addt",method=RequestMethod.POST)
	public Transaction addTransaction(@RequestBody Transaction t) {
		return tservice.addTransaction(t);
	}
	@RequestMapping(value="transaction/{transactionId}",method=RequestMethod.GET)
	public Transaction getTransactionByTId(@PathVariable int transactionId) {
		return tservice.getTransactionByTId(transactionId);
	}
	@RequestMapping(value="transaction/gett",method=RequestMethod.GET)
	public List<Transaction> getAllTransaction() {
		return tservice.getAllTransaction();
	}

}
