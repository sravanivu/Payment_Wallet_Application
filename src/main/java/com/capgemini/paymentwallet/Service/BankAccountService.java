package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.BankAccountRepository;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;

@Service
public class BankAccountService {
	@Autowired
	BankAccountRepository barepository;

	public List<BankAccount> getAllBankAccounts() {
		// TODO Auto-generated method stub
		return barepository.findAll();
	}

	public BankAccount addBankAccount(BankAccount ba) {
		// TODO Auto-generated method stub
		return barepository.save(ba);
	}

	public BankAccount getBankAccountById(int id) {
		// TODO Auto-generated method stub
		return barepository.findById(id).get();
	}

	public String deleteBankAccount(int id) 
	{
		BankAccount ba1=barepository.findById(id).get();
		if(ba1==null) {
			return "no record found";
		}
		else {
			barepository.delete(ba1);
			return "bankAccount deleted successfully";
		}
		
	}

	/*public BankAccount updateBankAccount(int id) {
		BankAccount
		// TODO Auto-generated method stub
		return null;
	}
	*/

}
