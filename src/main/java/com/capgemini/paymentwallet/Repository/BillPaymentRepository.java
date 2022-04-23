package com.capgemini.paymentwallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.paymentwallet.pojoclasses.BillPayment;

public interface BillPaymentRepository extends JpaRepository<BillPayment,Integer>{

}
