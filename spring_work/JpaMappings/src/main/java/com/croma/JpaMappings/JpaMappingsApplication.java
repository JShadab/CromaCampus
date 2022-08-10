package com.croma.JpaMappings;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.croma.JpaMappings.model.Employee;
import com.croma.JpaMappings.model.Passport;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JpaMappingsApplication implements CommandLineRunner {

	@Autowired
	private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingsApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {

		/** When Passport is the owner **/
//		Passport passport = entityManager.find(Passport.class, 305);
//		Employee employee = passport.getEmployee();

		/** When Employee is the owner **/
//		Employee employee = entityManager.find(Employee.class, 102);
//		log.info("employee -> " + employee);
//		Passport passport = employee.getPassport();

		/** For Bi Directional **/

		Passport passport = entityManager.find(Passport.class, 305);
		Employee employee = passport.getEmployee();

		log.info("employee -> " + employee);
		log.info("Passport -> " + passport);

		System.out.println("-------------------------------------------------");

		Employee employee2 = entityManager.find(Employee.class, 102);
		Passport passport2 = employee.getPassport();

		log.info("employee -> " + employee2);
		log.info("Passport -> " + passport2);

	}

}
