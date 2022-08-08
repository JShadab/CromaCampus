package com.croma.SpringBootWithJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private int age;
	private double salary;
	private String email;
	private String password;
	
	@OneToOne
	private Address address;
	

}
