package com.croma.springaopdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croma.springaopdemo.entity.Employee;
import com.croma.springaopdemo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveOrUpdate(Employee employee) {

		Employee empDb = employeeRepository.save(employee);

		return empDb;
	}

	public void delete(long id) {
		employeeRepository.deleteById(id);
	}

	public Employee getOne(long id) {
		return employeeRepository.findById(id).orElseThrow();
	}

	public List<Employee> getAll() {

		List<Employee> emps = employeeRepository.findAll();

		return emps;
	}

}
