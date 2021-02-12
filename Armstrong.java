import java.util.Scanner;

//$Id$

public class Armstrong {
	
	public static boolean isArmStrongNumber(int number) {
		//digits(number) return no of digits in a number
		int noOfDigits = NoOfDigits.digits(number);
		int arm = 0;
		int temp = number;
		while(temp > 0) {
			int rem = temp % 10;
			temp /= 10;
			//power return the rem ^ noOfDigits
			arm += PowerOfNumber.power(rem, noOfDigits);
		}
		return arm == number;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = in.nextInt();
		if(isArmStrongNumber(number)) {
			System.out.println("Armstorng Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
