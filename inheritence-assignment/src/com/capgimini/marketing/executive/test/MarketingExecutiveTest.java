package com.capgimini.marketing.executive.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgimini.marketing.executive.model.MarketingExecutive;

class MarketingExecutiveTest {


	MarketingExecutive employee;
	
	@BeforeEach
	public void setUp() {
		employee=new MarketingExecutive(1001,"PRANU",25000,6000,20);
		
	}
	@Test
	public void testGrossSalaryOfMarketingExecutive() {
		assertEquals(45100,employee.grossSalary(),0.01);
	}
	@Test
	public void testNetSalaryOfMarketingExecutive() {
		assertEquals(41900,employee.netSalary(),0.01);
	}
	
}

