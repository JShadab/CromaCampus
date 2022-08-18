package com.croma.client2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${my.message}")
	private String message;

	@Value("${my.fruits}")
	private List<String> fruits;

	@GetMapping("/")
	public String greet() {
		return "<h1> Hello From Clinet-2 application</h1>" + "<h1>" + message + " and fruits are : " + fruits + "</h1>";
	}

}
