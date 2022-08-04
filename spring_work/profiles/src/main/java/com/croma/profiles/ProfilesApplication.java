package com.croma.profiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication implements CommandLineRunner {

	@Value("${my.name}")
	private String name;

	@Value("${my.age}")
	private int age;

	@Value("${my.fruits}")
	private List<String> fruits;

	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello " + name + " your age is " + age);
		System.out.println(fruits);
	}

}
