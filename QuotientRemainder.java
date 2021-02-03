import java.util.Scanner;
public class QuotientRemainder{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dividend and divisor:");
        int dividend = in.nextInt();
        int divisor = in.nextInt();
        System.out.println("Quotient = " + dividend / divisor);
        System.out.println("Remainder = " + dividend % divisor);

    }
}