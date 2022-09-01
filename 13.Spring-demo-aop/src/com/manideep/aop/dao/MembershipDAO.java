package com.manideep.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addSillymember()
	{
		System.out.println(getClass()+" : Doing Stuff: Adding a membership account");
		
	}
	
	public void goTosleep()
	{
		System.out.println(getClass()+" : I'm going to sleep now");
		
	}
}
