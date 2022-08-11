package com.croma;

public class StudentService {

	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public int addStudent(Student student) {
		return studentRepository.save(student);
	}

}
