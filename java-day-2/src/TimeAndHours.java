import java.util.*;

public class TimeAndHours {
	public static void main(String [] args) {
		int hours;
		int minutes;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter hours value");
		hours = sc.nextInt();
		System.out.println("Enter minutes value");
		minutes = sc.nextInt();
		Time time1 = new Time();
		time1.setTime(hours,minutes);
		time1.displayTime();
		System.out.println("Enter hours value");
		hours = sc.nextInt();
		System.out.println("Enter minutes value");
		minutes = sc.nextInt();
		Time time2 = new Time();
		time2.setTime(hours,minutes);
		time2.displayTime();
		Time time3 = new Time();
		time3=time1.sumOfTimes(time2); 
		time3.displayTime();
		
		
	}
}

