package com.croma.RestWebServicesWithJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	private int id;
	
	private String name;
	private int age;
	private double salary;
	private String email;
	private String password;
	

}
