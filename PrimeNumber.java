import java.util.Scanner;

//$Id$

public class PrimeNumber {
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++){
			if(num % i ==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = in.nextInt();
		if(isPrime(number)) {
			System.out.println("It is prime");
		} else {
			System.out.println("It is not prime");
		}
	}

}
