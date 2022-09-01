package com.manideep.aop.dao;

import org.springframework.stereotype.Component;

import com.manideep.aop.Account;

@Component
public class AccountDAO {

	public void addAccount(Account thec,boolean vipFalg)
	{
		System.out.println(getClass() + " : Doing My DB Work: Adding An Account");;
		
	}
	
	public boolean doWork()
	{
		System.out.println(getClass() + " : doWork()");;
		return false;
	}
	
	
}
