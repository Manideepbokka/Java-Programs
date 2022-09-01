package com.manideep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
public static void main(String args[])
{
	ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("bean scope-applicationContext.xml");
	
	Coach thech=ctxt.getBean("myCoach",Coach.class);
	
	Coach alpha=ctxt.getBean("myCoach",Coach.class);
	
	boolean res=(thech==alpha);
	
	System.out.println("Pointing to same location "+res);
	
	System.out.println("memory location of thech "+thech);
	
	System.out.println("memory location of alpha "+alpha);
	
	
}
}
