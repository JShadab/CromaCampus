package com.croma.StudentService.model;

public class Student {

	private String name;
	private String course;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
