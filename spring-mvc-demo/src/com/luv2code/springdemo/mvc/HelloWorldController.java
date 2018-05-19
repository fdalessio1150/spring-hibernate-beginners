package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/show-form")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm() {
		return "helloworld";
	}
	
}
