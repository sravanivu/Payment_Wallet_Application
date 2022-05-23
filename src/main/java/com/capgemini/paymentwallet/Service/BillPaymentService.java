package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Exception.IdAlreadyExistsException;
import com.capgemini.paymentwallet.Exception.NotFoundException;
import com.capgemini.paymentwallet.Repository.BillPaymentRepository;

import com.capgemini.paymentwallet.pojoclasses.BillPayment;

@Service
public class BillPaymentService {
	@Autowired(required=true)
	BillPaymentRepository bprepository;

	public List<BillPayment> getAllBillPayments() {
		List<BillPayment> existingba=bprepository.findAll();
		if(existingba!=null) {
			return bprepository.findAll();
		}
		else {

			throw new NotFoundException(" Zero bill payments done!!! ");
		}
		
	}
	public BillPayment addBillPayment(BillPayment bp) {
		
		BillPayment exisitingBillPayment=bprepository.findById(bp.getBillId()).orElseThrow();
		if(exisitingBillPayment==null) {
			
			return bprepository.save(bp);
			
		}
		else
		{
			throw new IdAlreadyExistsException("Paymen "+bp.getBillId()+" already exist!!");
		}
	}
	public BillPayment getBillPaymentById(int id) {
		return ( bprepository.findById(id).orElseThrow(()->new NotFoundException("No Payment present with id="+id)));
	}
	

}
