package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Course;
import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;
import com.manideep.hibernate.demo.entity.Review;
import com.manideep.hibernate.demo.entity.Student;

public class CreateCoursesAndStudentsDemo5 {

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
			
			int tid=1;
			Student tempst=s.get(Student.class, tid);
			System.out.println(tempst);
			System.out.println(tempst.getCourses());
			Course temp1=new Course("Learn React.js complete");
			Course temp2=new Course("Learn Vue.js complete");


			temp1.addStudent(tempst);
			temp2.addStudent(tempst);
			
			
			s.save(temp1);
			s.save(temp2);
			
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
