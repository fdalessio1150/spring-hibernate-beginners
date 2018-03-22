package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// App deve ser configuravel -> utilizando o arquivo que cria o container nos podemos passar qual a classe que ira implementar a interface
// Podemos modificar facilmente o tecnico -> apenas modificando a implementacao
// Principal vantagem -> Não precisamos modificar o source code compilado, apenas o arquivo de configuracao

public class SpringHelloApp {

	public static void main(String[] args) {

		// Load the Spring Configuration file -> creating spring container
		// Carrega o arquivo contendo todas as referências de beans/objetos que devem ser criadas
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve a bean/object from spring container
		// Nesse caso esse comando diz ei me da um objeto Coach, baseado no container que subiu no passo anterior ele 
		// vai retornar esse objeto. Como se trata de uma interface ele pode retornar qualquer classe/objeto que implementa ela
		// A interface so exibe o que está disponivel, por isso temos que criar a bean/objeto de uma classe que implementa ela
		Coach theCoach = context.getBean("myCoach", Coach.class);
				
		// Call Methods on the bean -> like object
		// Ao criar o objeto, podemos implementar os seus metodos
		System.out.println(theCoach.getDailyWorkout());

		// Close the context
		context.close();

	}

}
