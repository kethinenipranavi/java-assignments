package com.capgemini.exceptionhandling.model;

import com.capgemini.exceptionhandling.exception.AgeNotWithinRangeException;
import com.capgemini.exceptionhandling.exception.NameNotWithinRangeException;

public class Student {
	public int rollNo;
	public String name;
	public int age;
	public String course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void checkage() throws AgeNotWithinRangeException   {
		if (this.age <= 15 && this.age >= 22) {
			System.out.println("valid age");
		} else {
			throw new AgeNotWithinRangeException("not valid");
		}
	}
	public void checkname() throws NameNotWithinRangeException {
		if(getName().matches("[a-zA-z]*")) {
			System.out.println("valid name");
		}
		else
			throw new NameNotWithinRangeException("name is not valid");
	}


}
