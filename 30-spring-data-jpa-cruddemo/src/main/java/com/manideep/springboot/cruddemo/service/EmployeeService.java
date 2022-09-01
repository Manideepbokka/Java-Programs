package com.manideep.springboot.cruddemo.service;

import java.util.List;

import com.manideep.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmploee);
	
	public void deleteById(int theId);
}
