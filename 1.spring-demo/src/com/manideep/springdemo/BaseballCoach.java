package com.manideep.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for dependency
	private FortuneService fs;
	
	//define constructor for DI
	public BaseballCoach(FortuneService thefs)
	{
		fs=thefs;
	}
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}
	
}
