import java.util.Scanner;

//$Id$

public class PrimeNumsWithinInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the interval a and b");
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i=a; i <= b; i++) {
			// using PrimeNumber.isPrime(num) return true if it is prime
			if(PrimeNumber.isPrime(i)){
				System.out.print(i + " ");
				
			}
		}

	}

}
