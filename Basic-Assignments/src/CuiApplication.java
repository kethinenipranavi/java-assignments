import java.util.Scanner;
public class CuiApplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			String username;
	String password;
	int count=0;
	while(count<3)
	{
		username=sc.nextLine();
		password=sc.nextLine();
		if(username.equals("pranavi") && password.equals("pranu8")) {
			System.out.println("Welcome"+username);
			break;
		}
		else {
			++count;
			System.out.println("attempts left"+(3-count));
			
		}
	}
	if(count==3) {
		System.out.println("contact admin");
		sc.close();
	}
}
}
