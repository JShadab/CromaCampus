package com.croma;

public class StudentResource {

	private StudentService studentService;

	public StudentResource(StudentService studentService) {
		this.studentService = studentService;
	}

	public int addStudent(Student student) {
		studentService.logInfo();
		studentService.logInfo();
		studentService.logInfo();
		studentService.logInfo();
		return studentService.addStudent(student);
	}

}
