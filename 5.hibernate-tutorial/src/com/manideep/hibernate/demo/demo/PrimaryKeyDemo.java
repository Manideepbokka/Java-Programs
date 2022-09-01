package com.manideep.hibernate.demo.demo;
import java.lang.reflect.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
public static void main(String args[])
{
	SessionFactory f=new Configuration()
			.configure("hibernate.cfg2.xml")
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();
	Session s=f.getCurrentSession();
	try
	{
		System.out.println("Creating 3 student objects....");
		Student temp=new Student("Bokka","Manideep","saimanideep159@gmail.com");
		Student temp1=new Student("Sai","Manideep","saimanideep159@gmail.com");
		Student temp2=new Student("Bokka","Sai","saimanideep159@gmail.com");
		s.beginTransaction();
		System.out.println("Saving the students...");
		s.save(temp);
		s.save(temp1);
		s.save(temp2);
		s.getTransaction().commit();
		System.out.println("Done!");
	}
	finally 
	{
		f.close();
	}
}
}
