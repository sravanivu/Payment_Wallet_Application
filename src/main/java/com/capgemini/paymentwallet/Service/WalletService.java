package com.capgemini.paymentwallet.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.WalletRepository;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Customer;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

@Service
public class WalletService {
	@Autowired
	WalletRepository wrepository;

	public Customer showBalanceofMobile(String mobile) {
		
		//Customer c1=wrepository.findByMobile(mobile).get();
		// TODO Auto-generated method stub
		return wrepository.showBalanceofMobile(mobile) ;
	}

//	public Customer addAccountw(String name1, String mobile1, BigDecimal amount1) {
//     	Customer c1=new Customer();
////		Wallet w1=new Wallet();
////		c1.setcName(name1);
////		c1.setMobile(mobile1);
////		c1.setWallet(w1.setBalance(amount1));
//		// TODO Auto-generated method stub
//		return wrepository.addAccountw(name1,mobile1,amount1);
//				//save(c1.setcName(name1),c1.setMobile(mobile1));
//				//addAccountw(name,mobile,amount);
//	}

}
