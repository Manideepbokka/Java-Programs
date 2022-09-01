
//Bidirectional one getiing instructor from instructordetail class.
package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {
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
			
			int tid=3000;
			InstructorDetail tempid=s.get(InstructorDetail.class,tid);
			
			System.out.println("tempInstructorDetail: "+tempid);
			
			System.out.println("the associated instructor :"+tempid.getInstructor());

			s.getTransaction().commit();
			System.out.println("Done!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			//handle connection leak issue
			s.close();
			
			
			f.close();
		}
	}
}
