package com.manideep.hibernate.demo.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Student;

public class QueryStudentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg2.xml")  
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session s=f.getCurrentSession();
		try
		{
			s.beginTransaction();
			//display all items
			List<Student> thes=s.createQuery("from Student").getResultList();
			displaylist(thes);
			//dispaly lastname="Manideep"
			
			System.out.println("------------------------------------------");
			thes=s.createQuery("from Student s where s.lastName='Manideep'").getResultList();
			displaylist(thes);
			
			//display latname="Manideep" or firstname="Bokka"
			System.out.println("------------------------------------------");
			thes=s.createQuery("from Student s where s.lastName='Manideep' OR s.firstname='Bokka'").getResultList();
			System.out.println(thes);
			
			//dispaly email like "gmail.com"
			System.out.println("------------------------------------------");
			thes=s.createQuery("from Student s where s.email like '%gmail.com'").getResultList();
			System.out.println(thes);
			s.getTransaction().commit();
		}
		finally
		{
			f.close();
		}
				
	}
	
	private static void displaylist(List<Student> thes)
	{
		thes.forEach(a->System.out.println(a));
	}

}
