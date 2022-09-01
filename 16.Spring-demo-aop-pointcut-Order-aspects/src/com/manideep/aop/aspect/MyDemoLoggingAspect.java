package com.manideep.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
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
	

	
	@Before("com.manideep.aop.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	}
	
}
