package com.manideep.springdemo;

public class HockeyCoach implements Coach {

	private FortuneService fsd;
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public HockeyCoach() {
		System.out.println("HockeyCoach: inside no-arg constructor");
	}

	public void setFsd(FortuneService fsd) {
		this.fsd = fsd;
		System.out.println("HockeyCoach: inside setter method");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hockey is india national sport";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fsd.getFortune();
	}
	

}
