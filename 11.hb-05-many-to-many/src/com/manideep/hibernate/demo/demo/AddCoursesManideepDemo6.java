package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Course;
import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;
import com.manideep.hibernate.demo.entity.Review;
import com.manideep.hibernate.demo.entity.Student;

public class AddCoursesManideepDemo6 {

	public static void main(String args[])
	{
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg2.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session s=f.getCurrentSession();
		try
		{
			s.beginTransaction();
			
			Course temp=new Course("Learn JavaScript complete");
			s.save(temp);
			Student t1=new Student("Manideep","Bokka","saimanideep159@gmaill.com");
			Student t2=new Student("Vamsi","Bokka","chandravamsi357@gmail.com");
			
			temp.addStudent(t1);
			temp.addStudent(t2);
			
			s.save(t1);
			s.save(t2);
			
			//commit
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
