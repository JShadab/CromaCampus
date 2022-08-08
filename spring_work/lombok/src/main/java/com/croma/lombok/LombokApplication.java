package com.croma.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.croma.lombok.model.Employee;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);

		// Employee emp1 = new Employee();
		Employee emp1 = Employee.builder().build();

		// Employee emp2 = new Employee(101, , 36, 112233);
		Employee emp2 = Employee.builder()
				.name("Musa")
				.id(101)
				.age(36)
				.salary(112233)
				.build();
		
	//	Employee emp3 = new Employee("Musa");
		Employee emp3 = Employee.builder()
				.name("Musa")
				.build();
		
	//	Employee emp4 = new Employee("Musa", 36);
		Employee emp4 = Employee.builder()
				.name("Musa")
				.age(36)				
				.build();
		
	

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
	}

}
