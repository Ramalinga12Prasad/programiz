import java.util.Scanner;

//$Id$

public class NoOfDigits {
	public static int digits(int num) {
		int count =0;
		while (num>0) {
			num /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		System.out.println("No of digits " + digits(num));
		

	}

}
