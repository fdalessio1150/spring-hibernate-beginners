package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

		TennisCoach theAlphaCoach = context.getBean("tennisCoach", TennisCoach.class);

		boolean result = (theCoach == theAlphaCoach);
				
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(theAlphaCoach);
		
		System.out.println(theCoach.getEmail());
		System.out.println(theAlphaCoach.getEmail());
		context.close();

	}

}
