import java.util.Scanner;

public class IncomeTax {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	long annualSalary;
	annualSalary=sc.nextLong();
	if (annualSalary > 0 && annualSalary <=180000)
		System.out.println("tax amount is nill");
	else if (annualSalary >=180001 && annualSalary <=300000)
		System.out.println("tax amount is " + annualSalary * 0.10);
	else if (annualSalary >=300001 && annualSalary <=500000)
		System.out.println("tax amount is" + annualSalary * 0.20);
	else if (annualSalary >=500001 && annualSalary <=1000000)
		System.out.println("tax amount is" + annualSalary * 0.30);
			

	sc.close();
	}

}
