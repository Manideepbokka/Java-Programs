package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Course;
import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;
import com.manideep.hibernate.demo.entity.Student;

public class CreateCoursesDemo3 {

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
			
			Course tempc1=new Course("Learn Java Basic to Advanced!!");
			Course tempc2=new Course("Learn Spring Framework");
			Course tempc3=new Course("Learn SpringBoot Framework");
			Course tempc4=new Course("Learn Hibernate");
			
			myi.add(tempc1);
			myi.add(tempc2);
			myi.add(tempc3);
			myi.add(tempc4);
			
			s.save(tempc1);
			s.save(tempc2);
			s.save(tempc3);
			s.save(tempc4);
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
