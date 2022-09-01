package com.manideep.javaannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String fortunes[]= {"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"};
	private Random mr=new Random();
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		int index=mr.nextInt(fortunes.length);
		String ans=fortunes[index];
		return ans;
	}

}
