package com.croma;

public class StudentRepositoryTest {

	private StudentRepository studentRepository;

	Student student;

	//@BeforeEach
	public void setUp() {

		this.studentRepository = new StudentRepository();
		this.student = new Student(101, "Abc", "abc@gmail.com");

	}

	//@Test
	public void test_AddStudent() {

		int count = studentRepository.save(student);

		//assertEquals(1, count);

	}

}
