import java.util.Scanner;
public class Alphabet{
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        if(Character.isAlphabetic(x)) {
            System.out.println("It is a Alphabet");
        } else {
            System.out.println("It is not a Alphabet");
        }
    }
}