package com.manideep.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manideep.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entitymanag;
	
	@Autowired
	public EmployeeDAOImpl(EntityManager theentitymanag)
	{
		entitymanag=theentitymanag;
	}
	
	
	@Override
	public List<Employee> findAll() {
		
		Session s=entitymanag.unwrap(Session.class);
		
		Query<Employee> theQuery=s.createQuery("from Employee",Employee.class);
		
		List<Employee> emps=theQuery.getResultList();
		
		return emps;
	}


	@Override
	public Employee findbyId(int theId) {
		Session s=entitymanag.unwrap(Session.class);
		
		Employee emp=s.get(Employee.class, theId);
		
		return emp;
	}


	@Override
	public void save(Employee theEmploee) {
		Session s=entitymanag.unwrap(Session.class);
		
		s.saveOrUpdate(theEmploee);
		
	}


	@Override
	public void deleteById(int theId) {
		Session s=entitymanag.unwrap(Session.class);
		
		Query thequery=s.createQuery("delete from Employee where id=:employeeId");
		thequery.setParameter("employeeId",theId);
		thequery.executeUpdate();
		
	}

	
}
