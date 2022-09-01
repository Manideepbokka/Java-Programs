package com.manideep.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//@Before("execution(public void add*())")
	//@Before("execution(public void addAccount())")
	//@Before("execution(* void add*())")
	//@Before("execution(* * add*())")
	//@Before("execution(public void addAccount())")
	
//	@Before("execution(* add*(com.manideep.aop.Account,..))")
//	public void beforeAddAccountAdvice()
//	{
//		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
//		
//	}
	
	@Pointcut("execution(* com.manideep.aop.dao.*.*(..))")
	private void forDaoPackage() {}
	
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	}
	
	
	@Before("forDaoPackage()")
	public void performApiAnalytics()
	{
		System.out.println("\n=====>>> Performing API Analytics");
		
	}
}
