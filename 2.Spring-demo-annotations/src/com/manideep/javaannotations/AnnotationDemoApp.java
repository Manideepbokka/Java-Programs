package com.manideep.javaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		//get bean from spring container
		Coach thech=ctx.getBean("tennisCoach",Coach.class);
		
		
		//call a method on beaan
		System.out.println(thech.getDailyWorkout());
		
		System.out.println(thech.getDailyFortune());
	
		
		//close the context\
		ctx.close();

	}

}
