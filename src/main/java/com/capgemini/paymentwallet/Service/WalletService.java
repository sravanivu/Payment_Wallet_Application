package com.capgemini.paymentwallet.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.WalletRepository;
import com.capgemini.paymentwallet.pojoclasses.Customer;

@Service
public class WalletService {
	@Autowired
	WalletRepository wrepository;

	public Customer addAccountw(String name, String mobile, BigDecimal amount) {
		// TODO Auto-generated method stub
		return wrepository.addAccountw(name,mobile,amount);
	}

}
