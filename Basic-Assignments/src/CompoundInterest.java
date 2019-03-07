import java.util.Scanner;

public class CompoundInterest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int principleamount;
		double annualrate;
		int time;
		principleamount = sc.nextInt();
		annualrate = sc.nextFloat();
		time = sc.nextInt();
		double simpleinterest = principleamount * annualrate * time;
		System.out.println(simpleinterest);
		int compoundperyear;
		compoundperyear = sc.nextInt();
		double compoundinterest = (float) (principleamount
				* Math.pow((1 + (annualrate / compoundperyear)), compoundperyear * time));
		System.out.println(compoundinterest);
		sc.close();
	}
}
