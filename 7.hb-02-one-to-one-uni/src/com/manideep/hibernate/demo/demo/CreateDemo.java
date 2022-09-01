package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;
import com.manideep.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String args[])
	{
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg2.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session s=f.getCurrentSession();
		try
		{
			//create objects
			Instructor ti=new Instructor("Manideep","Bokka","saimanideep159@bsmd.com");
			
			InstructorDetail tid=new InstructorDetail("BSMD java","love java!!");
			
			//associate the objects
			ti.setInstructordet(tid);
			s.beginTransaction();
			
			//Note this will also save details object
			//because of CascadeType.ALL
			System.out.println("Saving Instructor");
			s.save(ti);
			
			s.getTransaction().commit();
			System.out.println("Done!");
		}
		finally 
		{
			f.close();
		}
	}
}
