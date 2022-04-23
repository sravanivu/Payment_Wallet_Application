package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.paymentwallet.Repository.BillPaymentRepository;
import com.capgemini.paymentwallet.pojoclasses.BillPayment;

@Service
public class BillPaymentService {
	@Autowired
	BillPaymentRepository bprepository;

	public List<BillPayment> getAllBillPayments() {
		// TODO Auto-generated method stub
		return bprepository.findAll();
	}
	public BillPayment addBillPayment(BillPayment bp) {
		return bprepository.save(bp);
	}
	public BillPayment getBillPaymentById(int id) {
		// TODO Auto-generated method stub
		return bprepository.findById(id).get();
	}
	

}
