package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.manideep.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String args[])
	{
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg2.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session s=f.getCurrentSession();
		try
		{
			System.out.println("Creating new student object");
			Student temp=new Student("Bokka","Manideep","saimanideep159@gmail.com");
			s.beginTransaction();
			System.out.println("Saving the student...");
			s.save(temp);
			s.getTransaction().commit();
			System.out.println("Done!");
		}
		finally 
		{
			f.close();
		}
	}
}
