package com.croma.RestWebServicesWithJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.croma.RestWebServicesWithJPA.model.Employee;
import com.croma.RestWebServicesWithJPA.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee/{email}/{password}")
	public Employee authenticate(@PathVariable String email, String password) {

		return employeeService.authenticate(email, password);
	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return employee;
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return employee;
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Employee deleted Successfully";
	}

	@GetMapping("/employee/{id}")
	public Employee getOneEmployee(@PathVariable int id) {

		Employee emp = employeeService.getOneEmployee(id);
		return emp;
	}

	@GetMapping("/employeeByEmail/{email}")
	public Employee getOneEmployeeByEmail(@PathVariable String email) {

		Employee emp = employeeService.getOneEmployee(email);
		return emp;
	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

//	@GetMapping("/employee/{id}")
//	public ResponseEntity<Object> getOneEmployee(@PathVariable int id) {
//
//		Employee emp = employeeRepository.getOneEmployee(id);
//
//		if (emp == null) {
//			return new ResponseEntity<>("NO employee found", HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(emp, HttpStatus.OK);
//		}
//
//	}

}
