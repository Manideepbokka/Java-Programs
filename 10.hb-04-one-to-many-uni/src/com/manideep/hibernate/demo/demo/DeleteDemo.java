package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {
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
			s.beginTransaction();
			
			int tid=2;
			Instructor tinst=s.get(Instructor.class, tid);
			
			if(tinst!=null)
			{
				//Will also delete associated "details" Object
				//because of CascadeType.ALL
				s.delete(tinst);
			}

			s.getTransaction().commit();
			System.out.println("Done!");
		}
		finally 
		{
			f.close();
		}
	}
}
