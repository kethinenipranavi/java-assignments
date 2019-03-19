package com.capgimini.employee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgimini.employee.model.Employee;

public class EmployeeTest {
	Employee employee;
	@Before
	public void setUp() {
	employee=new Employee(101,"PRANAVI",25000,6000);
	}
	
	@Test
	public void testEmployeeObjectIsCreatedWithDefaultConstructor() {
		Employee employee=new Employee();
		assertNotNull(employee);	
	}
	
	@Test
	public void testEmployeeObjectIsCreatedWithparameterizedConstructor() {
		Employee employee=new Employee(101,"PRANAVI",25000,6000);
		assertNotNull(employee);
		assertEquals(101,employee.getEmployeeId());
		assertEquals("PRANAVI",employee.getEmployeeName());
		assertEquals(25000,employee.getBasicSalary(),0.01);
		assertEquals(6000,employee.getMedical(),0.01);
	}
	@Test
	public void testCaluculateEmployeeGrossSalary() {
		assertEquals(43500, employee.grossSalary(),0.01);
	}
	@Test
	public void testCalculateEmployeeNetSalary() {
		assertEquals(40300, employee.netSalary(),0.01);
	}
}

