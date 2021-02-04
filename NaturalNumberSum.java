import java.util.Scanner;
public class NaturalNumberSum{
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        int sum = 0;
        for (int i=1 ; i<=n; i++){
            sum += i;
        }
        System.out.printf("Sum of natural number upto %d is %d",n,sum);
    }
}