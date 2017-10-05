package com.dnb.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringBootWebDemoApplication {
	
	@ResponseBody
	@RequestMapping("/") 
	String entry() {
		return "My First Spring Boot App";
	}
	
	@ResponseBody
	@RequestMapping("/hello")
	String hello() {
		return "Hello2!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebDemoApplication.class, args);
	}
}
