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

@RestController
public class BenificiaryDetailsController {
	@Autowired(required = true)
	BenificiaryDetailsService bdservice;

	@RequestMapping(value = "bd/getall", method = RequestMethod.GET)
	public List<BenificiaryDetails> getAllBenificiaryDetails() {
		return bdservice.getAllBenificiaryDetails();
	}

	@RequestMapping(value = "bd/addbd", method = RequestMethod.POST)
	public BenificiaryDetails addBenificiaryDetails(@RequestBody BenificiaryDetails bd) {
		return bdservice.addBenificiaryDetails(bd);
	}

	@RequestMapping(value = "bd/delete/{id}", method = RequestMethod.DELETE)
	public String deleteBenificiaryDetails(@PathVariable int id) {
		return bdservice.deleteBenificiaryDetails(id);
	}

	@RequestMapping(value = "bd/get/{mobileNumber}", method = RequestMethod.GET)
	public BenificiaryDetails getBenificiaryDetailsofmobilenumber(@PathVariable String mobileNumber) {
		return bdservice.getBenificiaryDetailsofmobilenumber(mobileNumber);
	}

	@RequestMapping(value = "bd/getbd/{id}", method = RequestMethod.GET)
	public BenificiaryDetails getBenificiaryDetailsById(@PathVariable int id) {
		return bdservice.getBenificiaryDetailsById(id);
	}

}

