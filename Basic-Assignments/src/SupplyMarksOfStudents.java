import java.util.Scanner;
public class SupplyMarksOfStudents {
	public static void main(String[] args) {

		int maths;
		int physics;
		int chemistry;

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
