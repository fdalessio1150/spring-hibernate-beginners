package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	// Injecao de dependecia pelo Construtor
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("Inside contructor TennisCoach");
		this.fortuneService = fortuneService;
	}

	// Injecao de dependecia pelo metodo Set
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setFortuneService");
		this.fortuneService = fortuneService;
	}
	*/
	
	// Injecao de dependecia por qualquer nmetodo
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("Inside doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
