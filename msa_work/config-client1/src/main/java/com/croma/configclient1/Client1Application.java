package com.croma.configclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Client1Application {

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
		
		System.out.println("CloudClient-1 application");
	}

}
