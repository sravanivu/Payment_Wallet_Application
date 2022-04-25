package com.capgemini.paymentwallet.Repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.paymentwallet.pojoclasses.Customer;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

public interface WalletRepository  extends JpaRepository<Wallet,Integer>{
	
	
	//c.name LIKE '_r%' is TRUE for 'Brazil' and FALSE for 'Denmark'
	
	@Query(value="select c from Customer c where c.mobile LIKE %?1%")
	
	Customer showBalanceofMobile(String mobile);
	
	
	//Customer addAccountw(String name1, String mobile1, BigDecimal amount1);

	

}
