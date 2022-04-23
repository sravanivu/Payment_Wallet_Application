package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.BankAccountRepository;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

@Service
public class BankAccountService {
	@Autowired
	BankAccountRepository barepository;

	public List<BankAccount> getAllBankAccounts() {
		// TODO Auto-generated method stub
		return barepository.findAll();
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

	public BankAccount updateBankAccount(int id, BankAccount ba) {
		BankAccount ba1=barepository.findById(id).get();
		if(ba!=null) {
			ba1.setAccountNo(ba.getAccountNo());
			ba1.setIfscCode(ba1.getIfscCode());
			ba1.setBankName(ba1.getBankName());
			ba1.setBalance(ba.getBalance());
			ba1.setWallet(ba.getWallet());		
			return barepository.save(ba1);
		}
		else
			return ba1;

	}




	public BankAccount addBankAccount(BankAccount ba) {
		// TODO Auto-generated method stub
		return barepository.save(ba);
	}




	public Wallet addBankAccount1(BankAccount ba) {
		// TODO Auto-generated method stub
		return barepository.save(ba).getWallet();
	}
	

}
