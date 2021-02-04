import java.util.Scanner;
public class PositiveOrNegative{
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number > 0 ) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}