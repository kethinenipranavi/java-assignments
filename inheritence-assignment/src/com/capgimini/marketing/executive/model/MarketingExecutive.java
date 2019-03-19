package com.capgimini.marketing.executive.model;

import com.capgimini.employee.model.Employee;

public class MarketingExecutive extends Employee {
	
	private double kilometersTravelled;
	private double tourAllowance;
	private static final double telephoneAllowance=1500;
	public MarketingExecutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical, double kilometersTravelled) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kilometersTravelled=kilometersTravelled;
		// TODO Auto-generated constructor stub
	}
	public double grossSalary() {
		tourAllowance=kilometersTravelled*5;
		return super.grossSalary()+telephoneAllowance+tourAllowance;
		
	}
	
	public double netSalary() {
		return super.netSalary();
	}
}
