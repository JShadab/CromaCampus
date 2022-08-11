package com.croma;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentResourceTest {

	private StudentResource studentResource;

	@Mock
	private StudentService studentService;

	Student student;

	@Before
	public void setUp() {

		this.studentResource = new StudentResource(studentService);
		this.student = new Student(101, "Abc", "abc@gmail.com");

	}

	@Test
	public void test_AddStudent() {

		when(studentService.addStudent(student)).thenReturn(1);

		int count = studentResource.addStudent(student);

		assertEquals(1, count);

	}

}
