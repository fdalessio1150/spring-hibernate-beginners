package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService myFortune) {
		this.fortuneService = myFortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "10 kicks to the goal";
	}

	@Override
	public String getWeeklyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
