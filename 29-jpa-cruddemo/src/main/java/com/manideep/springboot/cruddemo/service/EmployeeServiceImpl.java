package com.manideep.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manideep.springboot.cruddemo.dao.EmployeeDAO;
import com.manideep.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeDAO empdao;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") EmployeeDAO empdao)
	{
		this.empdao=empdao;
	}
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		return empdao.findAll();
	}

	@Override
	@Transactional
	public Employee findbyId(int theId) {
		// TODO Auto-generated method stub
		return empdao.findbyId(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmploee) {
		// TODO Auto-generated method stub
      empdao.save(theEmploee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
			
		empdao.deleteById(theId);
	}

}
