package com.croma.JpaMappings.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Employee {

	@Id
	private int id;

	private String name;

	@OneToOne(fetch = FetchType.LAZY)
	private Passport passport;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
