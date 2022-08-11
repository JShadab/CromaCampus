package com.croma;

public class StudentResource {

	private StudentService studentService;

	public StudentResource(StudentService studentService) {
		this.studentService = studentService;
	}

	public int addStudent(Student student) {
		return studentService.addStudent(student);
	}

}
