package com.manideep.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.manideep.aop.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	
	public List<Account> findAccounts()
	{
		List<Account> myaccs=new ArrayList<>();
		Account temp1=new Account("John","Silver");
		Account temp2=new Account("Madhu","Gold");
		Account temp3=new Account("Luca","Silver");
		myaccs.add(temp1);
		myaccs.add(temp2);
		myaccs.add(temp3);
		return myaccs;
	}
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
