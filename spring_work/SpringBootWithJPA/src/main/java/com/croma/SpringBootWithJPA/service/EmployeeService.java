package com.croma.SpringBootWithJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croma.SpringBootWithJPA.model.Employee;
import com.croma.SpringBootWithJPA.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {

		log.info("addEmployee() start.....");
		employeeRepository.save(employee);
		log.info("addEmployee() end.....");
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Employee deleted Successfully";
	}

	public Employee getOneEmployee(int id) {

		Employee emp = employeeRepository.findById(id).orElse(null);
		return emp;
	}

	public Employee getOneEmployee(String email) {

		Employee emp = employeeRepository.findByEmail(email).orElse(null);
		return emp;
	}

	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	public Employee authenticate(String email, String password) {
		Employee emp = employeeRepository.findByEmailAndPassword(email, password).orElse(null);
		return emp;
	}

}
