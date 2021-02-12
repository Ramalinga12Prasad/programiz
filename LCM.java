import java.util.Scanner;

//$Id$

public class LCM {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter two numbers :");
	int num1 = in.nextInt();
	int num2 = in.nextInt();
	int lcm = Math.max(num1, num2);
	while(true) {
		if(lcm %num1 == 0 && lcm%num2 ==0) {
			break;
		}
		lcm++;
	}
	System.out.print("LCM is " + lcm);
	}
}
