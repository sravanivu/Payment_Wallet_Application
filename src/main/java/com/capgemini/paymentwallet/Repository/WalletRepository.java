package com.capgemini.paymentwallet.Repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.paymentwallet.pojoclasses.Customer;
import com.capgemini.paymentwallet.pojoclasses.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

	@Query(value = "select c from Customer c where c.mobile=?1")
	Customer showBalanceofMobile(@Param("mobile") String mobile);

}
