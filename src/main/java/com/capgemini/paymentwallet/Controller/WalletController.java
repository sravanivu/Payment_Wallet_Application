package com.capgemini.paymentwallet.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
//	@RequestMapping(value="wallet/ca",method=RequestMethod.POST)
//	public Customer addAccountw(@RequestBody String name1,@RequestBody String mobile1,@RequestBody BigDecimal amount1) {
//		
//		
//		return wservice.addAccountw(name1,mobile1,amount1);
//			
//		}
	
	@RequestMapping(value="wallet/balance/{mobile}",method=RequestMethod.GET)
	public Customer showBalanceofMobile(@PathVariable String mobile) {
		return wservice.showBalanceofMobile(mobile);
	}

}
