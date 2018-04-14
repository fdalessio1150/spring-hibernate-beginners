package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// Create the object
		// Coach theCoach = new BaseballCoach();
		FortuneService service = new HappyFortuneService();
		Coach theCoach = new TrackCoach(service);

		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
