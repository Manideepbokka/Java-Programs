package com.manideep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load spring configuration file
		ClassPathXmlApplicationContext cnt=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach thc=cnt.getBean("myCoach",Coach.class);
		
		//call methods on bean
		System.out.println(thc.getDailyWorkout());
		
		System.out.println(thc.getFortune());
		
		//close the context
		cnt.close();
		

	}

}
