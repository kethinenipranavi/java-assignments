
public class Complex {
	private double real;
	private double imaginary;
		public void setRealAndImaginary(double real,double imaginary) {
			this.real=real;
			this.imaginary=imaginary;
		}
		public void displayComplexNumber() {
			System.out.println("complex number = "+real+ "+" +imaginary+"i");
		}
		public Complex sumOfTwoComplexNumbers(Complex number) {
			Complex complex3=new Complex();
			complex3.real=this.real+number.real;
			complex3.imaginary=this.imaginary+number.imaginary;
			return complex3;
		}
}
