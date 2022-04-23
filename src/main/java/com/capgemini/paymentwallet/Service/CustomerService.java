package com.capgemini.paymentwallet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.paymentwallet.Repository.CustomerRepository;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository crepository;

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return crepository.findAll();
	}

	public Customer addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return crepository.save(c);
	}

	public Customer getBankAccountCustomerById(int id) {
		// TODO Auto-generated method stub
		return crepository.getById(id);
	}

	public String deleteCustomer(int id) {
		Customer c1=crepository.findById(id).get();
		if(c1!=null) {
			crepository.delete(c1);
			return "deleted successfully";
		}
		else
			return "No record found";
		
	}

	public Customer updateCustomer(int id, Customer c) {
		Customer c1=crepository.findById(id).get();
		if(c1!=null) {
			c1.setcId(c.getcId());
			c1.setcName(c.getcName());
			c1.setMobile(c.getMobile());
			c1.setPassword(c.getPassword());
			c1.setWallet(c.getWallet());
			return crepository.save(c1);
		}
		else
			return c1;
	}

	public Customer validatelogin(String mobile, String password) {
		// TODO Auto-generated method stub
		return crepository.validatelogin(mobile,password);
	}

	
}
