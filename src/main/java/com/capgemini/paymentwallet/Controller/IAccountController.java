package com.capgemini.paymentwallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.IAccountService;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

@RestController
public class IAccountController {
	@Autowired(required = true)
	IAccountService baservice;
	 @CrossOrigin(origins="*")
	@RequestMapping(value = "/getallba", method = RequestMethod.GET)
	public List<BankAccount> getAllBankAccounts() {
		return baservice.getAllBankAccounts();
	}
    @CrossOrigin(origins="*")
	@RequestMapping(value = "/addaccount1", method = RequestMethod.POST)
	public BankAccount addBankAccount(@RequestBody BankAccount ba) {
		return baservice.addBankAccount(ba);

	}
//    @CrossOrigin(origins="*")
	@RequestMapping(value = "/addaccount", method = RequestMethod.POST)
	public Wallet addBankAccount1(@RequestBody BankAccount ba) {
		return baservice.addBankAccount1(ba);

	}
   // @CrossOrigin(origins="*")
	@RequestMapping(value = "/getba/{id}", method = RequestMethod.GET)
	public BankAccount getBankAccountById(@PathVariable int id) {
		return baservice.getBankAccountById(id);
	}
    @CrossOrigin(origins="*")

	@RequestMapping(value = "/deleteba/{id}", method = RequestMethod.DELETE)
	public Wallet deleteBankAccount(@PathVariable int id) {
		return baservice.deleteBankAccount(id);
	}
    @CrossOrigin(origins="*")
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public BankAccount updateBankAccount(@PathVariable int id, @RequestBody BankAccount ba) {
		return baservice.updateBankAccount(id, ba);
	}

}
