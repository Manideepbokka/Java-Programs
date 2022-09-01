package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Student;

public class DeleteStudentDemo {
public static void main(String args[])
{
	SessionFactory f=new Configuration()
			.configure("hibernate.cfg2.xml")
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();
	Session s=f.getCurrentSession();
	
	try
	{
		s.beginTransaction();
//		Student ms=s.get(Student.class, 1);
//		s.delete(ms);
		
		s.createQuery("delete from Student where id=2").executeUpdate();
		s.getTransaction().commit();
		
	}
	finally
	{
		f.close();
	}
}
}
