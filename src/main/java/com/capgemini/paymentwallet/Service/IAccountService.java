package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Exception.NotFoundException;
import com.capgemini.paymentwallet.Exception.InvalidUserInputException;
import com.capgemini.paymentwallet.Repository.IAccountRepository;
import com.capgemini.paymentwallet.Repository.WalletRepository;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

@Service
public class IAccountService {
	@Autowired(required = true)
	IAccountRepository barepository;
	WalletService wwservice;
	WalletRepository wwrepository;

	public List<BankAccount> getAllBankAccounts() {
		List<BankAccount> existingba = barepository.findAll();
		if (existingba != null) {
			return barepository.findAll();
		} else {

			throw new NotFoundException(" No Bank Accounts found");
		}

	}

	public BankAccount getBankAccountById(int id) {

		return (barepository.findById(id).orElseThrow(() -> new NotFoundException("No BankAccount present with id=" + id)));

	}

	public Wallet deleteBankAccount(int id) {
		BankAccount ba1 = barepository.findById(id).orElse(null);
		if (ba1 == null) {

			throw new NotFoundException(" Account does not exist");
		} else {
			barepository.delete(ba1);
			System.out.println("bankAccount deleted successfully");
			return ba1.getWallet();
		}

	}

	public BankAccount updateBankAccount(int id, BankAccount ba) {
		BankAccount ba1 = barepository.findById(id)
				.orElseThrow(() -> new NotFoundException("No Payment present with id=" + id));

		if (ba != null) {

			ba1.setIfscCode(ba.getIfscCode());
			ba1.setBankName(ba.getBankName());
			ba1.setBalance(ba.getBalance());
			ba1.setWallet(ba.getWallet());
			return barepository.save(ba1);
		} else {
			return ba1;
		}

	}

	public BankAccount addBankAccount(BankAccount ba) {

		BankAccount existingBankAccount = barepository.findById(ba.getId()).orElse(null);

		if (existingBankAccount == null) {
			return barepository.save(ba);
		} else {
			throw new InvalidUserInputException(" Account already exists returns bank account");
		}

	}

	public Wallet addBankAccount1(BankAccount ba) {
		BankAccount existingBankAccount = barepository.findById(ba.getId()).orElse(null);
		if (existingBankAccount == null) {
			return barepository.save(ba).getWallet();

		} else {
			throw new InvalidUserInputException(" Account already exists returns wallet");
		}

	}

}
