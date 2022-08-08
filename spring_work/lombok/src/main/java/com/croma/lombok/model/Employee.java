package com.croma.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {


	private int id;
	private String name;
	private int age;
	private double salary;
	private String email;

}
