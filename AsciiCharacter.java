import java.util.Scanner;
public class   AsciiCharacter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character :");
        
        char x = in.next().charAt(0);
        System.out.println(Integer.valueOf(x));
    
        
        
    }
}