package com.croma;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {

	// PROXY -> SPY -> STUB -> MOCK

	private StudentService studentService;

	@Mock
	private StudentRepository studentRepository;

	@Before
	public void setUp() {

		this.studentService = new StudentService(studentRepository);

	}

	@Test
	public void test_AddStudent() {

		when(studentRepository.save(any())).thenReturn(1);

		Student stud = new Student();

		int result = studentService.addStudent(stud);

		assertEquals(1, result);

	}

}
