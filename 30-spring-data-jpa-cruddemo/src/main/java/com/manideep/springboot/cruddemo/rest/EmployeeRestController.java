package com.manideep.springboot.cruddemo.rest;

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

import com.manideep.springboot.cruddemo.entity.Employee;
import com.manideep.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService empser;
	
	@Autowired
	public EmployeeRestController(EmployeeService empser)
	{
		this.empser=empser;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll()
	{
		return empser.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId)
	{
		Employee themp=empser.findById(employeeId);
		
		if(themp==null)
		{
			throw new RuntimeException("Employee id not found -"+employeeId);
			
		}
		return themp;
	}
	
	@PostMapping("/employees")
	public void setEmployee(@RequestBody Employee emp)
	{
		emp.setId(0);
		empser.save(emp);
		
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theemp)
	{
		empser.save(theemp);
		return  theemp;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId)
	{
      Employee themp=empser.findById(employeeId);
		
		if(themp==null)
		{
			throw new RuntimeException("Employee id not found -"+employeeId);
			
		}
		empser.deleteById(employeeId);
		return "Deleted employee id - "+employeeId;
	}
	}

