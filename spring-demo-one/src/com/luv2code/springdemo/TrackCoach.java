package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String getWeeklyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}

}
