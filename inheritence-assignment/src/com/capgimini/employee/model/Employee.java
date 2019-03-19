package com.capgimini.employee.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private  double hra=0.05;
	private double medical;
	private double pf=0.10;
	private double pt=200;
	private double netSalary;
	private double grossSalary;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}


	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	
	
	public double grossSalary() {
		hra=0.50*basicSalary;
		grossSalary=basicSalary+hra+medical;
		return grossSalary;
	}
	public double netSalary() {
		pf=0.12*basicSalary;
				pt=200;
		netSalary=grossSalary()-(pt+pf);
		return netSalary;
	}

}
