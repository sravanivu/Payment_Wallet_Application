package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Exception.IdAlreadyExistsException;
import com.capgemini.paymentwallet.Exception.NotFoundException;
import com.capgemini.paymentwallet.Repository.BenificiaryDetailsRepository;
import com.capgemini.paymentwallet.pojoclasses.BenificiaryDetails;

@Service
public class BenificiaryDetailsService {
	@Autowired(required = true)
	BenificiaryDetailsRepository bdrepository;

	public List<BenificiaryDetails> getAllBenificiaryDetails() {

		List<BenificiaryDetails> existingbd = bdrepository.findAll();
		if (existingbd != null) {
			return bdrepository.findAll();
		} else {

			throw new NotFoundException(" No BenificiaryDetails found ");
		}

	}

	public BenificiaryDetails addBenificiaryDetails(BenificiaryDetails bd) {

		BenificiaryDetails exisitingBenificiaryDetails = bdrepository.findById(bd.getBenificiaryId()).orElse(null);
		if (exisitingBenificiaryDetails == null) {

			return bdrepository.save(bd);

		} else {
			throw new IdAlreadyExistsException(
					"BenificiaryDetails of ID =  " + bd.getBenificiaryId() + " already exist!!");
		}
	}

	public String deleteBenificiaryDetails(int id) {
		BenificiaryDetails bd1 = bdrepository.findById(id)
				.orElseThrow(() -> new NotFoundException("No BenificiaryDetails are present with id=" + id));
		if (bd1 != null) {
			bdrepository.delete(bd1);
			return "deleted successfully";
		} else
			return "no record found";
	}

	public BenificiaryDetails getBenificiaryDetailsById(int id) {

		return (bdrepository.findById(id)
				.orElseThrow(() -> new NotFoundException("No BenificiaryDetails present with id=" + id)));

	}

	public BenificiaryDetails getBenificiaryDetailsofmobilenumber(String mobileNumber) {

		return bdrepository.getBenificiaryDetailsofmobilenumber(mobileNumber);
	}

}
