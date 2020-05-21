package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Learner. Welcome to Ascend Program – SpringBoot and Microservice Architecture.";
	}
}
