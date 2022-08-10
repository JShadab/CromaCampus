package com.croma.springaopdemo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class AuditLog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String desription;

	private LocalDate createDate;

}
