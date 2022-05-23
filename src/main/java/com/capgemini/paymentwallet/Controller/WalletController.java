package com.capgemini.paymentwallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.WalletService;
import com.capgemini.paymentwallet.pojoclasses.Customer;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

@RestController
public class WalletController {
	@Autowired(required = true)
	WalletService wservice;

	@RequestMapping(value = "wallet/balance/{mobile}", method = RequestMethod.GET)
	public Customer showBalanceofMobile(@PathVariable String mobile) {
		return wservice.showBalanceofMobile(mobile);
	}

	@RequestMapping(value = "wallet/getall", method = RequestMethod.GET)
	public List<Wallet> getallCustomers() {
		return wservice.getallCustomers();
	}

}
