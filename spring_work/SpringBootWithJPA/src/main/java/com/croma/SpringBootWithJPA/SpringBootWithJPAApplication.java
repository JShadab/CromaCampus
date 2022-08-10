package com.croma.SpringBootWithJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.croma.SpringBootWithJPA.model.Address;
import com.croma.SpringBootWithJPA.model.Employee;
import com.croma.SpringBootWithJPA.repository.AddressRepository;
import com.croma.SpringBootWithJPA.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootWithJPAApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Address address = Address.builder().city("Lucknow").state("UP").zip("226022").build();
		Address addressDB = addressRepository.save(address);

		Employee employee = Employee.builder().name("Musa").email("abc@gmail.com").address(addressDB).build();
		employeeService.addEmployee(employee);

		log.info("Data inserted succesfully");

	}

}
