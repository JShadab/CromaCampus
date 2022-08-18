package com.croma.StudentService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croma.StudentService.model.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		Student student = new Student("Musa", "MCA");

		return student;
	}

}
