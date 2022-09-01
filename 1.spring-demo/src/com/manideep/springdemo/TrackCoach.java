package com.manideep.springdemo;

public class TrackCoach implements Coach {

	private FortuneService nfs;
	public TrackCoach(FortuneService bfds)
	{
		nfs=bfds;
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return nfs.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}
	
	public void Domystartupstuff()
	{
		System.out.println("inside init method domystartupstuff()");
	}
	public void Domycleanupstuff()
	{
		System.out.println("inside destroy method domycleanupstuff()");
	}

}
