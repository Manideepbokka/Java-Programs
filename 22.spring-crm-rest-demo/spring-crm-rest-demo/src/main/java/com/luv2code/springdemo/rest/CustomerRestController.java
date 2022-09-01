package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	//autowiring
	@Autowired
	private CustomerService cserv;

	//add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return cserv.getCustomers();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId)
	{
		Customer thse=cserv.getCustomer(customerId);
		if(thse==null)
		{
			throw new CustomerNotFoundException("Customer Id not found -->"+customerId);
		}
		return thse;
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer thecus)
	{
		thecus.setId(0);
		cserv.saveCustomer(thecus);
		return thecus;
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer thecus)
	{
		cserv.saveCustomer(thecus);
		return thecus;
	}
	
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId)
	{
		Customer thcus=cserv.getCustomer(customerId);
		
		if(thcus==null)
		{
			throw new CustomerNotFoundException("Customer id not found - "+customerId);
		}
		cserv.deleteCustomer(customerId);
		return "Deleted Customer id - " +customerId;
	}
}
