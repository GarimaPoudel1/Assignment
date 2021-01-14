package assignment1;
import java.util.Scanner;
public class Task10c {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a greater than zero: ");
        double a = sc.nextDouble();
        if(a == 0) {
            System.out.println("The value of a cannot be zero");
            System.out.print("Enter the value of a greater than zero: ");
            a = sc.nextDouble();
        }
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double firstNominator= ((b* b) - 4 * a * c);
        if(firstNominator < 0) {
            System.out.println("Not a valid number to take square root of.");
            return;
        }
        double nominator = - b * Math.sqrt(firstNominator);
        double result = nominator / (2 * a);

        System.out.print(" The required value of x is: " + result);
    }


}
