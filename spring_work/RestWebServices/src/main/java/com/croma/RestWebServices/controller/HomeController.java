package com.croma.RestWebServices.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/greet")
	public String greet() {
		return "Welcome to CromaCampus FROM GET";
	}

	@PostMapping("/greet")
	public String doPost() {
		return "Welcome to CromaCampus  FROM POST";
	}

	@PutMapping("/greet")
	public String doPut() {
		return "Welcome to CromaCampus  FROM PUT";
	}

	@DeleteMapping("/greet")
	public String doDelete() {
		return "Welcome to CromaCampus  FROM DELETE";
	}

}
