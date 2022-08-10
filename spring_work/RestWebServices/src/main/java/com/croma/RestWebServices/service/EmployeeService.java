package com.croma.RestWebServices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croma.RestWebServices.model.Employee;
import com.croma.RestWebServices.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {

		log.info("addEmployee() start.....");
		
		employeeRepository.insert(employee);
		
		log.info("addEmployee() end.....");
		
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		employeeRepository.edit(employee);
		return employee;
	}

	public String deleteEmployee(int id) {
		employeeRepository.delete(id);
		return "Employee deleted Successfully";
	}

	public Employee getOneEmployee(int id) {

		Employee emp = employeeRepository.getOneEmployee(id);
		return emp;
	}

	public List<Employee> getAllEmployee() {

		return employeeRepository.getAllEmployees();
	}

}
