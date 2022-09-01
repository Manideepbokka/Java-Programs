package com.manideep.javaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read spring config file
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//get bean from spring container
		Coach thech=ctx.getBean("tennisCoach",Coach.class);
		Coach alpha=ctx.getBean("tennisCoach",Coach.class);
		
		boolean res=(thech==alpha);
		//call a method on beaan
		System.out.println(res);
		
		System.out.println("Memomry location for thech: "+thech);
		System.out.println("Memomry location for alpha: "+alpha);
		
	
		
		//close the context\
		ctx.close();
	}

}
