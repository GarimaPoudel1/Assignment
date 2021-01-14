package assignment1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int first_Int = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        int second_Int = in.nextInt();
        System.out.printf("Sum of two integers: %d%n", first_Int + second_Int);
        System.out.printf("Average of two integers: %.2f%n", (double) (first_Int + second_Int) / 2);

    }

}


