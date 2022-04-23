package com.capgemini.paymentwallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.BenificiaryDetailsService;
import com.capgemini.paymentwallet.pojoclasses.BenificiaryDetails;
import com.capgemini.paymentwallet.pojoclasses.Customer;

@RestController
public class BenificiaryDetailsController {
	@Autowired
	BenificiaryDetailsService bdservice;
	//
	@RequestMapping(value="bd/getall",method=RequestMethod.GET)
	public List<BenificiaryDetails> getAllBenificiaryDetails(){
		return bdservice.getAllBenificiaryDetails();
	}
	//required
	@RequestMapping(value="bd/addbd",method=RequestMethod.POST)
	public BenificiaryDetails addBenificiaryDetails(@RequestBody BenificiaryDetails bd) {
		return bdservice.addBenificiaryDetails(bd);
	}
	
	//required
	@RequestMapping(value="bd/delete",method=RequestMethod.DELETE)
	public String deleteBenificiaryDetails(@RequestBody int id) {
		return bdservice.deleteBenificiaryDetails(id);
	}
	//required
	@RequestMapping(value="bd/get/{mobileNumber}",method=RequestMethod.GET)
	public BenificiaryDetails getBenificiaryDetailsofmobilenumber(@PathVariable String mobileNumber) {
		return bdservice.getBenificiaryDetailsofmobilenumber(mobileNumber);
	}
	
	@RequestMapping(value="bd/getbd/{id}",method=RequestMethod.GET)
	public BenificiaryDetails getBenificiaryDetailsById(@PathVariable int id) {
		return bdservice.getBenificiaryDetailsById(id);
	}
	//viewallBenificiaryDetails(customer customer):list<BenificiaryDetails>
	//viewBenificiaryDetails(customer customer):BenificiaryDetails
	//error
	/*@RequestMapping(value="bd/{cId}",method=RequestMethod.GET)
	public BenificiaryDetails getBenificiaryDetailsByCustomerId(@PathVariable int cId,Customer customer) {
		return bdservice.getBenificiaryDetailsByCustomerId(cId,customer);
	}
	*/

}
