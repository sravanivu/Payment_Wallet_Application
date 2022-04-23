package com.capgemini.paymentwallet.Repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.paymentwallet.pojoclasses.Customer;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

public interface WalletRepository  extends JpaRepository<Wallet,Integer>{

	Customer addAccountw(String name, String mobile, BigDecimal amount);

}
