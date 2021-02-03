import java.util.Scanner;
public class QuadraticEquation{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double root1 ,root2; 
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double determinant = (b * b) - (4 * a * c);
        if(determinant > 0) {
            root1 = (- b + Math.sqrt(determinant)) / (2 * a);
            root2 = (- b - Math.sqrt(determinant)) / (2 * a);
            System.out.format( "Root 1 %.2f", root1);
            System.out.format( "Root 2 %.2f", root2);

        } else if (determinant == 0) {
            root1 = root2 = (- b ) / (2 * a);
            System.out.format( "Root 1 %.2f", root1);
            System.out.format( "Root 2 %.2f", root2);

        } else {
            double real  = -b / (2 *a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.println(imaginary);
            System.out.format("Root 1 %.2f + %.2fi\n",real,imaginary);
            System.out.format("Root 2 %.2f - %.2fi",real,imaginary);

        }
    }
}