import java.util.Scanner;
public class LeapYear{
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        boolean leap = false;
        if(year % 4 ==0) {
            if(year % 100 == 0){
                leap = year % 400 == 0;
            } else {
                leap = true;
            }
        }
        System.out.println(leap?"Leap Year": "Not a Leap Year");
    }
}