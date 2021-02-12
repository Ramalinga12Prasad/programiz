import java.util.Scanner;

//$Id$

public class ArmstrongNumWithinInterval {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter interval a and b: ");
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i=a; i <= b; i++) {
			// isArmStrongNumber(num) returns true if it is armstrong
			if(Armstrong.isArmStrongNumber(i)){
				System.out.print(i + " ");
				
			}
		}

	}

}
