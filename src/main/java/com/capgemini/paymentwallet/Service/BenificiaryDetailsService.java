package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.BenificiaryDetailsRepository;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.BenificiaryDetails;
import com.capgemini.paymentwallet.pojoclasses.Customer;

@Service
public class BenificiaryDetailsService {
	@Autowired
	BenificiaryDetailsRepository bdrepository;

	public List<BenificiaryDetails> getAllBenificiaryDetails() {
		// TODO Auto-generated method stub
		return bdrepository.findAll();
	}

	public BenificiaryDetails addBenificiaryDetails(BenificiaryDetails bd) {
		// TODO Auto-generated method stub
		return bdrepository.save(bd);
	}

	public String deleteBenificiaryDetails(int id) {
		BenificiaryDetails bd1=bdrepository.findById(id).get();
		if(bd1!=null) {
			bdrepository.delete(bd1);
			return "deleted successfully";
		}
		else
			return "no record found";
	}
	
	public BenificiaryDetails getBenificiaryDetailsById(int id) {
		// TODO Auto-generated method stub
		return bdrepository.findById(id).get();
	}

	public BenificiaryDetails getBenificiaryDetailsofmobilenumber(String mobileNumber) {
		// TODO Auto-generated method stub
		return bdrepository.getBenificiaryDetailsofmobilenumber(mobileNumber);
	}

	/*public BenificiaryDetails getBenificiaryDetailsByCustomerId(int cId,Customer cus) {
		// TODO Auto-generated method stub
		return bdrepository.getBenificiaryDetailsByCustomerId(cId,cus);
	}*/

}
