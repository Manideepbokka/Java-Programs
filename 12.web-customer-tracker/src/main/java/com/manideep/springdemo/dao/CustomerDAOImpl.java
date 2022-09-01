package com.manideep.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manideep.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	
	public List<Customer> getCustomers() {
	Session cur=sessionFactory.getCurrentSession();
	
	Query<Customer> thequery=cur.createQuery("from Customer order by lastname",Customer.class);
	
	List<Customer> cusms=thequery.getResultList();
		
	return cusms;
	}


	@Override
	public void saveCustomer(Customer thecustomer) {
		
		Session cs=sessionFactory.getCurrentSession();
		
		cs.saveOrUpdate(thecustomer);
			
	}


	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		Session cs=sessionFactory.getCurrentSession();
		
		Customer req=cs.get(Customer.class, theId);
		
		return req;
	}


	@Override
	public void deleteCustomer(int theId) {
		Session cs=sessionFactory.getCurrentSession();
		
		Query thequery=cs.createQuery("delete from Customer where id=:customerId");
		thequery.setParameter("customerId", theId);
		
		thequery.executeUpdate();	
		
	}
	
	

}
