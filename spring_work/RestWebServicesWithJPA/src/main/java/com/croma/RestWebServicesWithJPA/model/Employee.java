package com.croma.RestWebServicesWithJPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "My_Employee_Tbl")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "emp_name", length = 5)
	private String name;
	
	private int age;
	private double salary;
	private String email;
	private String password;
	

}
