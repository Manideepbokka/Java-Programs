package com.manideep.javaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fs;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default Constructor");
		
	}
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	
	//define my destroy method
	
	
	/*
	@Autowired
	public TennisCoach(FortuneService fs) {
		
		this.fs = fs;
	}
	*/
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fs)
//	{
//		System.out.println(">> TennisCoach: inside dosomecrazystuff() method");
//		this.fs=fs;
//	}

	public FortuneService getFs() {
		return fs;
	}

//    @Autowired
//	public void setFs(FortuneService fs) {
//    	System.out.println(">> TennisCoach: inside setFortuneService() method");
//		this.fs = fs;
//	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getDailyFortune();
	}

}
