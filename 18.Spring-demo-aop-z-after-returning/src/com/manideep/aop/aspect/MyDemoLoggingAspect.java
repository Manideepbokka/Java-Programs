package com.manideep.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
	
	@AfterReturning(pointcut="execution(* com.manideep.aop.dao.AccountDAO.findAccounts(..))",returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint thejp,List<Account> result)
	{
		//print out which method we are advising on
		String method=thejp.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: "+method);
		
		
		//print out the results of the method call
		System.out.println("\n=====>>> Result is: "+ result);
		
	}
}
