import java.util.Scanner;

//$Id$

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = in.nextInt();
		for(int i=1;i<number;i++){
			if(number % i ==0) {
				System.out.print(i + " ");
			}
		}

	}

}
