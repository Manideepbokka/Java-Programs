package com.manideep.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manideep.aop.dao.AccountDAO;
import com.manideep.aop.dao.MembershipDAO;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read spring config java class
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean from spring container
		AccountDAO theaccdao=context.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO thememdao=context.getBean("membershipDAO",MembershipDAO.class);
		
		Account thec=new Account();
		thec.setName("Manideep");
		thec.setLevel("Platinum");
		//call business method
		theaccdao.addAccount(thec,true);
		theaccdao.doWork();
		
		//call the accdao getter/setter methods
		theaccdao.setName("foobar");
		theaccdao.setServiceCode("Gold");
		
		String name=theaccdao.getName();
		String code=theaccdao.getServiceCode();
		
		//call the membership dao method
		thememdao.addSillymember();
		thememdao.goTosleep();
		
		//close context
		context.close();
	}

}