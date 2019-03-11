import java.util.Scanner;

public class Employee {
	public static void main(String [] args) {
		int id;
		String name;
		double monthlyBasic;
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		name=sc.next();
		monthlyBasic=sc.nextDouble();
		EmployeeDetails employee1=new EmployeeDetails(id,name,monthlyBasic);
		double annualBasic=employee1.getAnnualBasic();
		System.out.println("AnnualBasic"+annualBasic);
		double monthlyGrossSalary=employee1.getMonthlyGrossSalary();
		System.out.println("MonthlyGrossSalary"+monthlyGrossSalary);
		double annualGrossSalary=employee1.getAnnualGrossSalary();
		System.out.println("AnnualGrossSalary"+annualGrossSalary);
		double monthlyDeductions=employee1. getMonthlyDeductions();
		System.out.println("MonthlyDeductions"+monthlyDeductions);
		double monthlyTakeHome=employee1.getMonthlyTakeHome();
		System.out.println("MonthlyTakeHome"+monthlyTakeHome);
		double annualTakeHome=employee1.getAnnualTakeHome();
		System.out.println("AnnualTakeHome"+annualTakeHome);
}
}
	