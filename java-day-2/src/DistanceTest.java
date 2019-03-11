import java.util.*;

public class DistanceTest {
	public static void main(String [] args) {
		int feet;
		float inches;
		Scanner sc= new Scanner(System.in);
		Distance distance1=new Distance();
		feet=sc.nextInt();
		inches=sc.nextFloat();
		distance1.setFeetAndInches(feet,inches);
		distance1.displayFeetAndInches();

		Distance distance2=new Distance();
		feet=sc.nextInt();
		inches=sc.nextFloat();
		distance2.setFeetAndInches(feet,inches);
		distance2.displayFeetAndInches();
		
		Distance distance3;
		distance3=distance1.sumOfTwoDistanceVariables(distance2);
		distance3.displayFeetAndInches();
	}
}

