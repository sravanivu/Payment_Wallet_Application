package com.capgemini.paymentwallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.paymentwallet.pojoclasses.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	@Query(value="select c from Customer c where c.mobile=?1 and c.password=?2")
	Customer validatelogin(@Param("mobile")String mobile, @Param("password")String password);
 

}
