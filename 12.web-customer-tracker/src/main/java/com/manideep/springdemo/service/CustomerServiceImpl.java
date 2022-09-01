package com.manideep.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.manideep.springdemo.dao.CustomerDAO;
import com.manideep.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO cdao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return cdao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer thecustomer) {
		
		cdao.saveCustomer(thecustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return cdao.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		cdao.deleteCustomer(theId);
		
	}

	
}
