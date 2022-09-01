package com.manideep.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manideep.aop.dao.AccountDAO;

public class AfterreturningMainDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read spring config java class
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean from spring container
		AccountDAO theaccdao=context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theaccs=theaccdao.findAccounts();
		
		System.out.println("\n\n Main Program : AfterrturningMainDemoApp");
		System.out.println("----");
		System.out.println(theaccs);
		
		//close context
		context.close();
	}

}
