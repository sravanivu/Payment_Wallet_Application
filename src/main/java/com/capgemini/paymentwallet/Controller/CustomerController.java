package com.capgemini.paymentwallet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.paymentwallet.Service.BankAccountService;
import com.capgemini.paymentwallet.Service.CustomerService;
import com.capgemini.paymentwallet.pojoclasses.BankAccount;
import com.capgemini.paymentwallet.pojoclasses.Customer;
@RestController
public class CustomerController {
		@Autowired(required=true)
		CustomerService cservice;
		@RequestMapping(value="customer/getallc",method=RequestMethod.GET)
		public List<Customer> getAllCustomers(){
			return cservice.getAllCustomers();
		}
		@RequestMapping(value="Customer/addaccount",method=RequestMethod.POST)
		public Customer addCustomer(@RequestBody Customer c) {
			return cservice.addCustomer(c);
			
		}
		@RequestMapping(value="Customer/getc/{id}",method=RequestMethod.GET)
		public Customer getCustomerById(@PathVariable int id) {
			return cservice.getBankAccountCustomerById(id);
		}
		@RequestMapping(value="Customer/deletec/{id}",method=RequestMethod.DELETE)
		public String deleteCustomer(@PathVariable int id) {
			return cservice.deleteCustomer(id);
		}
		@RequestMapping(value="Customer/update/{id}",method=RequestMethod.PUT)
		public Customer updateCustomer(@PathVariable int id,@RequestBody Customer c) {
			return cservice.updateCustomer(id,c);
		}
		
		@RequestMapping(value="user",method=RequestMethod.GET)
			public Customer validatelogin(@RequestBody String mobile,@RequestBody String password) {
				return cservice.validatelogin(mobile,password);
			}
		

	

}
