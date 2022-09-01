package com.manideep.aop.dao;

import org.springframework.stereotype.Component;

import com.manideep.aop.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public String getName() {
		System.out.println(getClass() + " : in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " : in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " : in getServicecode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " : in setserviceCode()");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account thec,boolean vipFalg)
	{
		System.out.println(getClass() + " : Doing My DB Work: Adding An Account");;
		
	}
	
	public boolean doWork()
	{
		System.out.println(getClass() + " : doWork()");
		return false;
	}
	
	
}
