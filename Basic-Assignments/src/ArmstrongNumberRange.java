
public class ArmstrongNumberRange {
	public static void main(String[] args) {
		int n;

		for (int i = 100; i <= 999; i++) {
			int a = 0;
			int sum;
			n = i;
			while (n > 0) {
				sum = n % 10;
				n = n / 10;
				a = a + sum * sum * sum;
			}
			if (i == a) {
				System.out.println(i);

			}

		}
	}
}