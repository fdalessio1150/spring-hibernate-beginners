package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Mesmo lugar na memoria quando eu crio theCoach e alphaCoach
@Scope("singleton")
public class TennisCoach implements Coach {

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	
	// Injecao de dependencia pelo campo
	@Autowired
	// Caso tivesse outras classes que implementassem a interface FortuneService
	@Qualifier("randomFortuneService")  
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside default TennisCoach");
	}
	
	// define my detroy method
	
	// Injecao de dependecia pelo Construtor
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("Inside contructor TennisCoach");
		this.fortuneService = fortuneService;
	}
	*/
	
	// Injecao de dependecia pelo metodo Set
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setFortuneService");
		this.fortuneService = fortuneService;
	}
	*/
	
	// Injecao de dependecia por qualquer metodo
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
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("inside doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("inside doMyCleanUpStuff");
	}

}
