package com.croma.RestWebServices.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.croma.RestWebServicesWithJPA.model.Employee;
import com.croma.RestWebServicesWithJPA.repository.EmployeeRepository;
import com.croma.RestWebServicesWithJPA.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmpoyeeServiceTest {

	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeService employeeService;

	private Employee employee;

	@BeforeEach
	public void init() {

		employee = new Employee();

		employee.setAge(23);
		employee.setEmail("abc@gmail.com");
		employee.setName("Abc");
		employee.setPassword("1234");
		employee.setSalary(112233);
	}

	@Test
	public void shouldSaveEmpoyee() {

		Employee employeeDB = new Employee();

		employeeDB.setId(213);

		employeeDB.setAge(23);
		employeeDB.setEmail("abc@gmail.com");
		employeeDB.setName("Abc");
		employeeDB.setPassword("1234");
		employeeDB.setSalary(112233);

		when(employeeRepository.save(employee)).thenReturn(employeeDB);

		Employee empDB = employeeService.addEmployee(employee);

		assertNotNull(empDB);
		assertTrue(empDB.getId() == 213);
	}

}
