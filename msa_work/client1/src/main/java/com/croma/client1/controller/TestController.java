package com.croma.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${my.name}")
	private String name;

	@Value("${my.age}")
	private int age;

	@Value("${my.city.name}")
	private String city;

	@GetMapping("/")
	public String greet() {
		return "<h1> Hello From Clinet-1 application</h1> <h1> Name : " + name + ", Age: " + age + ", City: " + city
				+ " </h1>";
	}

}
