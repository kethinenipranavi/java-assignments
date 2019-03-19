package com.capgimini.manager.model;

import com.capgimini.employee.model.Employee;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double grossSalary() {
		petrolAllowance=0.08*getBasicSalary();
		foodAllowance=0.13*getBasicSalary();
		otherAllowance=0.03*getBasicSalary();
		return super.grossSalary() + petrolAllowance + foodAllowance + otherAllowance; 
	}

	@Override
	public double netSalary() {
		// TODO Auto-generated method stub
		return super.netSalary();
	}
}