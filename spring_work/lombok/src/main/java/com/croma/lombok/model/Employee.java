package com.croma.lombok.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

	private int id;
	private String firstName;
	private int age;
	private double salary;
	private String address;

}
