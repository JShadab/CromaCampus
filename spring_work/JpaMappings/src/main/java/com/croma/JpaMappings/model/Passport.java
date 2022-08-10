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
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Passport {

	@Id
	private int id;

	private String number;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "passport")
	private Employee employee;

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + "]";
	}

}
