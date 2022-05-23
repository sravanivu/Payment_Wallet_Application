package com.capgemini.paymentwallet.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.WalletRepository;
import com.capgemini.paymentwallet.pojoclasses.Customer;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

@Service
public class WalletService {
	@Autowired(required = true)
	WalletRepository wrepository;

	public Customer showBalanceofMobile(String mobile) {

		return wrepository.showBalanceofMobile(mobile);
	}

	public List<Wallet> getallCustomers() {

		return wrepository.findAll();
	}

}
