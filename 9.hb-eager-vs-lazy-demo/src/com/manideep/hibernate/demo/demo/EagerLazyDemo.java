package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Course;
import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;
import com.manideep.hibernate.demo.entity.Student;

public class EagerLazyDemo {

	public static void main(String args[])
	{
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg2.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		Session s=f.getCurrentSession();
		try
		{
			s.beginTransaction();
			
			Instructor myi=s.get(Instructor.class, 1);
			
			System.out.println("Instructor:  "+myi);
			
			System.out.println("Courses: "+myi.getCourses());
			s.getTransaction().commit();
			System.out.println("Done!");
		}
		finally 
		{
			s.close();
			f.close();
		}
	}
}
