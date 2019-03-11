public class EmployeeDetails {
		private int id;
		private String name;
		private double monthlyBasic;
		private static int medicalAllowance=1250;
		private static int conveyanceAllowance=800;
		private static double hra=0.05;
		private static double esic=0.0475;
		private static double pf=0.10;
	public EmployeeDetails(int id,String name,double monthlyBasic) {
		
			this.id=id;
			this.name=name;
			this.monthlyBasic=monthlyBasic;	
	}
	public double getAnnualBasic() {	
		return (12 *monthlyBasic);
	}
	public double getMonthlyGrossSalary() {
		return (monthlyBasic + (hra *monthlyBasic)+ medicalAllowance + conveyanceAllowance);
	}
	public double getAnnualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
	}
	public double getMonthlyDeductions() {
		double monthlyDeductions = 0;
		if(getMonthlyGrossSalary()<=10000)
			monthlyDeductions = monthlyDeductions+50;
		else
			monthlyDeductions = monthlyDeductions+100;
		if(monthlyBasic<=5000)
			monthlyDeductions = monthlyDeductions+(esic*monthlyBasic);
			monthlyDeductions = monthlyDeductions+(pf * monthlyBasic);
			return monthlyDeductions;
	}
	public double getMonthlyTakeHome() {
		return (getMonthlyGrossSalary() - getMonthlyDeductions());
	}
	public double getAnnualTakeHome() {
		return 12*getMonthlyTakeHome();
	}
}