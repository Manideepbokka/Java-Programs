package com.manideep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
public static void main(String args[])
{
	ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("beanLifecycle-applicationContext2.xml");
	
	Coach thech=ctxt.getBean("myCoach",Coach.class);
	
	System.out.println(thech.getDailyWorkout());
	System.out.println(thech.getFortune());
	
	ctxt.close();
	

	
	
}
}
