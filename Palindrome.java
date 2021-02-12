import java.util.Scanner;

//$Id$

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		//using ReverseNumber.reverse(num) to computer the reverse of a number 
		int rev = ReverseNumber.reverse(num);
		if(num == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
