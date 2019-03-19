package com.capgimini.manager.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgimini.manager.model.Manager;

public class ManagerTest {

	Manager manager;
	
	@Before
	public void setUp() {
		manager=new Manager(101,"PRANAVI",25000,6000);
		}
	@Test
	public void testGrossSalary() {
		assertEquals(49500, manager.grossSalary(),0.01);
	}
	@Test
	public void testNetSalary() {
		assertEquals(46300, manager.netSalary(),0.01);
	}
		
	
}
