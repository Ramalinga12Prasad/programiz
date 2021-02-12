import java.util.Scanner;

//$Id$

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		for(int i=1;i<11;i++) {
			System.out.printf("%d * %d = %d\n",i,num,i*num);
		}
	}

}
