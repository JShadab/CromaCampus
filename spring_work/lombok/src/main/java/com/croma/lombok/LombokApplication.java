package com.croma.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.croma.lombok.model.Employee;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);

		Employee emp = new Employee();
		emp.setFirstName("Abc");
		emp.setAge(23);

		System.out.println(emp);
	}

}
