import java.util.Arrays;
import java.util.Scanner;

//$Id$

public class GCD {
	
	public static int findGCD(int num1, int num2){
		if(num1 == 0) return num2;
		return findGCD(num1%num2,num2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int arr[] = new int[2];
		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		Arrays.sort(arr);
		System.out.println("GCD is " + findGCD(arr[1],arr[0]));
		

	}

}
