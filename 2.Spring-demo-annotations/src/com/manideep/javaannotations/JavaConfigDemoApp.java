package com.manideep.javaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		Coach thech=ctx.getBean("tennisCoach",Coach.class);
		
		
		//call a method on beaan
		System.out.println(thech.getDailyWorkout());
		
		System.out.println(thech.getDailyFortune());
	
		
		//close the context\
		ctx.close();

	}

}
