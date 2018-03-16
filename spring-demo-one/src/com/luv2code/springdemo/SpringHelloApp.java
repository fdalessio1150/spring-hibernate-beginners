package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {

		// Load the Spring Configuration file -> creating spring container
		// Carrega o arquivo contendo todas as referências de beans que devem ser criadas
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// Retrieve a bean/object from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call Methods on the bean -> like object
		// O objeto que implementa a interface, ou seja a bean/objeto 
		// faz referência a classe TrackCoach pelo xml, portanto ao 
		// chamar o método que a interface disponibiliza, quem irá 
		// implementar é a Track
		System.out.println(theCoach.getDailyWorkout());

		// Close the context
		context.close();

	}

}
