import java.util.Scanner;

//$Id$

public class PrimeSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		for (int i =2; i <= num/2; i++) {
			 if (PrimeNumber.isPrime(i) && PrimeNumber.isPrime(num-i)) {  
				 System.out.printf("%d = %d + %d\n", num, i, num -i);
			 }
		}

	}

}
