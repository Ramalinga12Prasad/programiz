import java.util.Scanner;

//$Id$

public class NoOfDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		int count =0;
		while (num>0) {
			num /= 10;
			count++;
		}
		System.out.println("No of digits " + count);
		

	}

}
