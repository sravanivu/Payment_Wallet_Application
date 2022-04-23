package com.capgemini.paymentwallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.BillPaymentService;
import com.capgemini.paymentwallet.pojoclasses.BillPayment;

@RestController
public class BillPaymentController {
	@Autowired
	BillPaymentService bpservice;
	@RequestMapping(value="billpayemt/getallbp",method=RequestMethod.GET)
	public List<BillPayment> getAllBillPayments(){
		return bpservice.getAllBillPayments();
	}
	//required
	@RequestMapping(value="billpayment/addbillpayment",method=RequestMethod.POST)
	public BillPayment addBillPayment(@RequestBody BillPayment bp) {
		return addBillPayment(bp);
	}
	//required but taken id on behaf of class
	@RequestMapping(value="billpayment/getbp/{id}",method=RequestMethod.GET)
	public BillPayment getBillPaymentById(@PathVariable int id) {
		return bpservice.getBillPaymentById(id);
	}
	
	

}
