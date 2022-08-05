package com.croma.RestWebServices.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.croma.RestWebServices.model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(Employee emp) {

		String sql = "INSERT INTO EMPLOYEE (id, name, age, salary) VALUES (?,?,?,?)";

		jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getAge(), emp.getSalary());

		System.out.println("Insertion done!!!!");

	}

	public void edit(Employee emp) {

		String sql = "UPDATE employee SET name =?, age =? , salary=? WHERE id=?";

		jdbcTemplate.update(sql, emp.getName(), emp.getAge(), emp.getSalary(), emp.getId());

		System.out.println("Updation done!!!!");

	}

	public void delete(int id) {

		String sql = "DELETE FROM employee WHERE id=?";

		jdbcTemplate.update(sql, id);

		System.out.println("Deletion done!!!!");

	}

	public List<Employee> getAllEmployees() {

		String sql = "SELECT * FROM Employee";

		List<Employee> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));

		System.out.println(list);

		return list;
	}

	public Employee getOneEmployee(int id) {

		String sql = "SELECT * FROM Employee WHERE id=?";

		List<Employee> list = jdbcTemplate.query(sql, new Object[] { id }, new BeanPropertyRowMapper<>(Employee.class));

		Employee emp = null;
		
		if (!list.isEmpty()) {
			emp = list.get(0);
		}

		return emp;
	}

}
