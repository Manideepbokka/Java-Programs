package com.manideep.hibernate.demo.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Student;

public class ReadStudentDemo {
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
			Student temp=new Student("Bokka","Chandra Vamsi","bokkachandravamsi@gmail.com");
			s.beginTransaction();
			System.out.println("Saving the student...");
			//System.out.println(temp);
			s.save(temp);
			s.getTransaction().commit();
			
			s=f.getCurrentSession();
			s.beginTransaction();
			Student myst=s.get(Student.class, temp.getId());
			System.out.println(myst);
			s.getTransaction().commit();
			System.out.println("Done!");
		}
		finally 
		{
			f.close();
		}
	}
}
