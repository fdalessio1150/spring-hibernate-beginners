package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "10 kicks to the goal";
	}

	@Override
	public String getWeeklyWorkout() {
		return null;
	}

}
