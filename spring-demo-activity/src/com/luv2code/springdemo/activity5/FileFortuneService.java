package com.luv2code.springdemo.activity5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "/home/fdalessio/Cursos/spring-hibernate-beginners/data-files/fortune-data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();
	
	public FileFortuneService() {

		System.out.println(">> FileFortuneService: inside default constructor");
		
	}
	
	@PostConstruct
	public void loadTheFortunesFile() {
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		theFortunes = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) 
		{
			String tempLine;
			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		
		String tempFortune = theFortunes.get(index);
		
		return tempFortune;
	}

}
