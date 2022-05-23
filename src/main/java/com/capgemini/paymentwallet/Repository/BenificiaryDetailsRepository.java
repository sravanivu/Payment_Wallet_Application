package com.capgemini.paymentwallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.paymentwallet.pojoclasses.BenificiaryDetails;
import com.capgemini.paymentwallet.pojoclasses.Customer;

public interface BenificiaryDetailsRepository extends JpaRepository<BenificiaryDetails, Integer> {

	@Query(value = "select bd from BenificiaryDetails bd where bd.mobileNumber=?1")
	BenificiaryDetails getBenificiaryDetailsofmobilenumber(@Param("mobileNumber") String mobileNumber);

}
