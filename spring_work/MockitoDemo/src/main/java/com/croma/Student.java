package com.croma;

public class Student {

	private int rollNum;
	private String name;
	private String email;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNum, String name, String email) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.email = email;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", email=" + email + "]";
	}

}
