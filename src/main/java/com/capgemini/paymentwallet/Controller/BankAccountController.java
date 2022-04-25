package com.capgemini.paymentwallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.BankAccountService;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

@RestController
public class BankAccountController {
	@Autowired(required=true)
	BankAccountService baservice;
	
	@RequestMapping(value="bankaccount/getallba",method=RequestMethod.GET)
	public List<BankAccount> getAllBankAccounts(){
		return baservice.getAllBankAccounts();
	}
	@RequestMapping(value="bankaccount/addaccount1",method=RequestMethod.POST)
	public BankAccount addBankAccount(@RequestBody BankAccount ba) {
		return baservice.addBankAccount(ba);
		
	}
	@RequestMapping(value="bankaccount/addaccount",method=RequestMethod.POST)
	public Wallet addBankAccount1(@RequestBody BankAccount ba) {
		return baservice.addBankAccount1(ba);
		
	}
	@RequestMapping(value="bankaccount/getba/{id}",method=RequestMethod.GET)
	public BankAccount getBankAccountById(@PathVariable int id) {
		return baservice.getBankAccountById(id);
	}
	@RequestMapping(value="bankaccount/deleteba/{id}",method=RequestMethod.DELETE)
	public String deleteBankAccount(@PathVariable int id) {
		return baservice.deleteBankAccount(id);
	}
	@RequestMapping(value="bankaccount/update/{id}",method=RequestMethod.PUT)
	public BankAccount updateBankAccount(@PathVariable int id,@RequestBody BankAccount ba) {
		return baservice.updateBankAccount(id,ba);
	}
	@PostMapping(value="bank/add")
	public BankAccount addBankA(@RequestBody BankAccount ba) {
		return baservice.addBankA(ba);
	}
}
