import java.util.Scanner;
public class Factorial{
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        int fact = 1;
        for (int i=1 ; i<=n; i++){
            fact *= i;
        }
        System.out.printf("Factorial of natural number upto %d is %d",n,fact);
    }
}