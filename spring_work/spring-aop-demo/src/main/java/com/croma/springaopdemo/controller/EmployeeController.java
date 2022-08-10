package com.croma.springaopdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croma.springaopdemo.entity.Employee;
import com.croma.springaopdemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public Employee saveOrUpdate(Employee employee) {
		return employeeService.saveOrUpdate(employee);
	}
	
	@PutMapping("/employee")
	public Employee update(Employee employee) {
		return employeeService.saveOrUpdate(employee);
	}

	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable long id) {
		employeeService.delete(id);
	}

	@GetMapping("/employee/{id}")
	public Employee getOne(@PathVariable long id) {
		return employeeService.getOne(id);
	}

	@GetMapping("/employee")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

}
