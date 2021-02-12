import java.util.Scanner;

//$Id$

public class FibonaciSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Enter a number");
		int a = 0;
		int b = 1;
		while(num-->0) {
			System.out.println(a);
			int temp = b;
			b = a + b;
			a = temp;
			 
		}
		

	}

}
