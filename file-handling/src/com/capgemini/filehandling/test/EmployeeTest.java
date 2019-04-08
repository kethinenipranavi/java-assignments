package com.capgemini.filehandling.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.filehandling.model.Employee;
import com.capgemini.filehandling.model.EmployeeDeserialization;
import com.capgemini.filehandling.model.EmployeeSerialization;

public class EmployeeTest {


	private Employee employee;
	private EmployeeSerialization employeeSerialization;
	private EmployeeDeserialization employeeDeserialization;

	@Test
	public void testEmployeeSerialization() throws IOException {
		employee = new Employee(145,"PRANAVI",35000.0);
		employeeSerialization = new EmployeeSerialization();
		assertTrue(employeeSerialization.writeObjectInFile("employee.ser", employee));
	}

	@Test
	public void testEmployeeDeSerialization() throws IOException, ClassNotFoundException {
		employee = new Employee(145,"PRANAVI",35000.0);
		employeeDeserialization = new EmployeeDeserialization();
		assertEquals(employee, employeeDeserialization.deSerialize("employee.ser"));
	}

}
