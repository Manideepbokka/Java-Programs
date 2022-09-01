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
	
	//create a pointcut for getter methods
	@Pointcut("execution(* com.manideep.aop.dao.*.get*(..))")
	private void getter() {}
	
	//create pointcut for setter methods
	@Pointcut("execution(* com.manideep.aop.dao.*.set*(..))")
	private void setter() {}
	
	//create pointcut: include package exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() ||setter() )")
	private void forDaoPackageNoGetterSetter() {}
	
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	}
	
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics()
	{
		System.out.println("\n=====>>> Performing API Analytics");
		
	}
}
