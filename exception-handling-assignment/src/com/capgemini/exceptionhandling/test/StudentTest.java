package com.capgemini.exceptionhandling.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptionhandling.exception.AgeNotWithinRangeException;
import com.capgemini.exceptionhandling.exception.NameNotWithinRangeException;
import com.capgemini.exceptionhandling.model.Student;




public class StudentTest {

	Student student;
	
	@Before
	public void setUp() {
		student=new Student(1215,"PRANAVI", 15,"IT");
	}
	
	@Test
	public void testEmployeeObjectIsCreatedWithparameterizedConstructor() {
		Student student=new Student(1215,"PRANAVI",15,"IT");
		assertNotNull(student);
		assertEquals(1215,student.getRollNo());
		assertEquals("PRANAVI",student.getName());
		assertEquals(15,student.getAge());
		assertEquals("IT",student.getCourse());
	}
	@Test(expected=AgeNotWithinRangeException.class)
	public void testCheckage() throws AgeNotWithinRangeException {
		student.checkage();
	}
	@Test(expected=NameNotWithinRangeException.class)
	public void testCheckname() throws NameNotWithinRangeException {
		Student student=new Student(1215,"PRANA784VI",15,"IT");
		student.checkname();
	}
}

	