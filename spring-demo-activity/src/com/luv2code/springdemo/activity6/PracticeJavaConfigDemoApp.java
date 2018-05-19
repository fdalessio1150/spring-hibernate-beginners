package com.luv2code.springdemo.activity6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeJavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PracticeSportConfig.class);

		Coach theCoach = context.getBean("wrestlingCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
			
		context.close();
	}
}
