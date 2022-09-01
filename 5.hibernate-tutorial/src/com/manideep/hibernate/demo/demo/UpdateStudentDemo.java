package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			s.createQuery("update Student set email='manideep@bsmd.com'").executeUpdate();
			Student ms=s.get(Student.class, 3);
			ms.setEmail("sai.bokka@webmd.com");
			
			s.getTransaction().commit();
		}
		finally
		{
			f.close();
		}
		
	}

}
