import java.util.Scanner;

public class IncomeTax {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	maths = sc.nextInt();
	physics = sc.nextInt();
	chemistry = sc.nextInt();
	if (maths > 60 && physics > 60 && chemistry > 60)
		System.out.println("passed");
	if ((maths > 60 && physics > 60) || (maths > 60 && chemistry > 60) || (physics > 60 && chemistry > 60))
		System.out.println("Promoted");
	if ((maths > 60 || (physics > 60 && chemistry > 60 && maths > 60))
			|| (physics > 60 || (maths > 60 && physics > 60 && chemistry > 60))
			|| (chemistry > 60 || (maths > 60 && physics > 60 && chemistry > 60)))
		System.out.println("failed");

	sc.close();
}
}
}
