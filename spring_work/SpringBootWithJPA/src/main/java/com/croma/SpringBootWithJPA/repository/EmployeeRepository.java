package com.croma.SpringBootWithJPA.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.croma.SpringBootWithJPA.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Optional<Employee> findByEmail(String email);
	Optional<Employee> findByEmailAndPassword(String email, String password);
	List<Employee> findAllByNameAndAgeOrSalary(String name, int age, double salary);

}
