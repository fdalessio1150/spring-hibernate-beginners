package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// Create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();

		// Use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
