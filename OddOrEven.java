import java.util.Scanner;
public class OddOrEven{
    public static void main(String args[]){
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num%2 == 0? "Even" : "Odd");
    }
}