import java.util.Scanner;

//$Id$

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		System.out.println("Enter operator + , - , / , *, %");
		double c = 0.0d;
		char x = in.next().charAt(0);
		switch(x){
		case '+' :c =  a + b;
		break;
		case '-' :c =  a - b;
		break;
		case '*' :c =  a * b;
		break;
		case '/' :c =  a / b;
		break;
 		case '%' :c =  a % b;
 		break;
		}
		System.out.println("Value after operation " + c);

	}

}
