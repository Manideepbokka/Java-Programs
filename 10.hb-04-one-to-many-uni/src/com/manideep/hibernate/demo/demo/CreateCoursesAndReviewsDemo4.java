package com.manideep.hibernate.demo.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manideep.hibernate.demo.entity.Course;
import com.manideep.hibernate.demo.entity.Instructor;
import com.manideep.hibernate.demo.entity.InstructorDetail;
import com.manideep.hibernate.demo.entity.Review;
import com.manideep.hibernate.demo.entity.Student;

public class CreateCoursesAndReviewsDemo4 {

	public static void main(String args[])
	{
		SessionFactory f=new Configuration()
				.configure("hibernate.cfg2.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		Session s=f.getCurrentSession();
		try
		{
			s.beginTransaction();
			
			//create a course
			Course temp=new Course("Learn JavaScript complete");
			//add some reviews
			temp.addReview(new Review("Great Course ... loved it"));
			temp.addReview(new Review("Cool Course, job well done"));
			temp.addReview(new Review("What a dumb course, you are an idiot!"));
			
			//save the course
			s.save(temp);
			
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
