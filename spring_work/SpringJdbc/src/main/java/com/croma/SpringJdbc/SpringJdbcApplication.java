package com.croma.SpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.croma.SpringJdbc.model.Employee;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Employee emp = new Employee(201, "Raju", 28, 9876);

		getAllEmployees();
		System.out.println("--------------");
		
		insert(emp);
		System.out.println("--------------");
		
		getAllEmployees();
		System.out.println("--------------");
		
		emp.setSalary(9999);
		edit(emp);
		System.out.println("--------------");
		
		getAllEmployees();
		System.out.println("--------------");

		delete(201);
		System.out.println("--------------");
		
		getAllEmployees();
		System.out.println("--------------");

	}

	private void insert(Employee emp) {

		String sql = "INSERT INTO EMPLOYEE (id, name, age, salary) VALUES (?,?,?,?)";

		jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getAge(), emp.getSalary());

		System.out.println("Insertion done!!!!");

	}

	private void edit(Employee emp) {

		String sql = "UPDATE employee SET name =?, age =? , salary=? WHERE id=?";

		jdbcTemplate.update(sql, emp.getName(), emp.getAge(), emp.getSalary(), emp.getId());

		System.out.println("Updation done!!!!");

	}

	private void delete(int id) {

		String sql = "DELETE FROM employee WHERE id=?";

		jdbcTemplate.update(sql, id);

		System.out.println("Deletion done!!!!");

	}

	private void getAllEmployees() {

		String sql = "SELECT * FROM Employee";

		List<Employee> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));

		System.out.println(list);
	}

}
