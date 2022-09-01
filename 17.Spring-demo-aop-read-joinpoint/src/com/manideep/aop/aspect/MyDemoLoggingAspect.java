package com.manideep.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.manideep.aop.Account;

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
	public void beforeAddAccountAdvice(JoinPoint thejp)
	{
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	
	//display the method signature
	MethodSignature ms=(MethodSignature) thejp.getSignature();
	System.out.println("Method:  "+ ms);
	//display the method arguments
	Object[] args=thejp.getArgs();
	
	for(Object temp:args)
	{
		System.out.println(temp);
		if(temp instanceof Account)
		{
			Account theAcc=(Account) temp;
			
			System.out.println("account name: "+theAcc.getName());
			System.out.println("account level: "+theAcc.getLevel());
			
		}
	}
	}
}
