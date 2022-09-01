package com.manideep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctr=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HockeyCoach thech=ctr.getBean("myhockey",HockeyCoach.class);
		
		System.out.println(thech.getDailyWorkout());
		
		System.out.println(thech.getFortune());
		
		System.out.println(thech.getEmailAddress());
		System.out.println(thech.getTeam());
		ctr.close();
		

	}

}
