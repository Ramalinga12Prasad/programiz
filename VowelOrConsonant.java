import java.util.Scanner;
public class VowelOrConsonant{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in)    ;
        System.out.println("Enter a Alphabet");
        char x = in.next().charAt(0);
        x = Character.toLowerCase(x);
        if(x =='a' ||
        x =='e' ||
        x =='i' ||
        x =='o' ||
        x =='u' 
        )
        {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}