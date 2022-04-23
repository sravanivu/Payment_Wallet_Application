package com.capgemini.paymentwallet.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.WalletService;
import com.capgemini.paymentwallet.pojoclasses.Customer;

@RestController
public class WalletController {
	@Autowired
	WalletService wservice;
	
	@RequestMapping(value="wallet/ca",method=RequestMethod.POST)
	public Customer addAccountw(@RequestBody String name,@RequestBody String mobile,@RequestBody BigDecimal amount) {
		return wservice.addAccountw(name,mobile,amount);
			
		}
	

}
