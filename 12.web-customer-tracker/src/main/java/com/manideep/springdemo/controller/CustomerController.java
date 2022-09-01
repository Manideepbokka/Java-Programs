package com.manideep.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manideep.springdemo.dao.CustomerDAO;
import com.manideep.springdemo.entity.Customer;
import com.manideep.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//need to inject customer dao
	@Autowired
	private CustomerService cserv;
	
	
	@GetMapping("/list")
	public String listCustomers(Model them)
	{
		List<Customer> thecust=cserv.getCustomers();
		them.addAttribute("cusms",thecust);
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model them)
	{
		Customer thecust=new Customer();
		them.addAttribute("customer", thecust);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer thecustomer)
	{
		cserv.saveCustomer(thecustomer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model themlo)
	{
		Customer thc=cserv.getCustomer(theId);
		themlo.addAttribute("customer", thc);
		return "customer-form";
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId)
	{
		cserv.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
}
