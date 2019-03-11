import java.util.*;

public class ComplexNumbers {
	public static void main(String [] args) {
		double real;
		double imaginary;
		Scanner sc= new Scanner(System.in);
		Complex complex1=new Complex();
		real=sc.nextDouble();
		imaginary=sc.nextDouble();
		complex1.setRealAndImaginary(real,imaginary);
		complex1.displayComplexNumber();

		Complex complex2=new Complex();
		real=sc.nextDouble();
		imaginary=sc.nextDouble();
		complex2.setRealAndImaginary(real,imaginary);
		complex2.displayComplexNumber();
		
		Complex complex3;
		complex3=complex1.sumOfTwoComplexNumbers(complex2);
		complex3.displayComplexNumber();
	}
}

