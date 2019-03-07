
public class ArmstrongNumber {
	public static void main(String[] args) {
		int a = 0;
		int sum;
		int temp;
		int number = 153;
		temp = number;
		while (number > 0) {
			sum = number % 10;
			number = number / 10;
			a = a + sum * sum * sum;
		}
		if (temp == a)
			System.out.println("The given number is  armstrong number");
		else
			System.out.println("the given number is not a armstrong number");

	}
}
