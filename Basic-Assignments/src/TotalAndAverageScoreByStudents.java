import java.util.Scanner;

public class TotalAndAverageScoreByStudents {
	public static void main(String[] args) {

		 int mark[] = new int[3];
	        int i;
	        float sum=0;
	        float avg, total;
	        Scanner sc = new Scanner(System.in);
			
	        System.out.print("Enter  student1 subject marks : ");
	       
	        for(i=0; i<3; i++)
	        {
	            mark[i] = sc.nextInt();
	            sum = sum + mark[i];
	        }
			
	        avg = sum/3;
	        total = sum;
	        
	        System.out.print("\nTotal = " +total );
			
	        System.out.print("Average Marks = " +avg);
	        
	        
			sc.close();
	        
	}
}
