import java.util.Scanner;

//$Id$

public class PowerOfNumber {
	
	public static int power(int num, int pow){
		int powerOfNumber = 1; 
		while(pow-- > 0){
			powerOfNumber *= num;
		}
		return powerOfNumber;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number and the power to be computed");
		int num = in.nextInt();
		int pow = in.nextInt();
		System.out.println("Power is " + power(num,pow));
	}

}
