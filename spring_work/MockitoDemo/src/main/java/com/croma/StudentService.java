package com.croma;

public class StudentService {

	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public int addStudent(Student student) {

		// Some code

		return studentRepository.save(student);
	}

	public void logInfo() {
		System.out.println("add student method calls from StudentService class");
	}

}
