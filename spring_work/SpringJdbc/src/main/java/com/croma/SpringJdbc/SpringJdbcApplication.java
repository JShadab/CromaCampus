package com.croma.SpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.croma.SpringJdbc.model.Employee;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
		System.out.println("Hello From main()");

	}

	@Override
	public void run(String... args) throws Exception {
		Employee emp1 = new Employee(101, "Musa", 26, 1100);
		insert(emp1);
	}

	private void insert(Employee employee) {

		String sql = "INSERT INTO EMPLOYEE (id, name, age, salary) VALUES (?, ?, ?, ?);";
		jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getAge(), employee.getSalary());
		System.out.println("Data Inserted successfully");

	}

	private void update(Employee employee) {

	}

	private void delete(int id) {

	}

	private Employee getOne(int id) {
		return null;
	}

	private List<Employee> getAll() {
		return null;
	}

}
