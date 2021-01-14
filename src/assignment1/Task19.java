package assignment1;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first side of a triangle: ");
        int first = sc.nextInt();

        System.out.print("Please enter second side of a triangle: ");
        int second = sc.nextInt();

        System.out.print("Please enter third side of a triangle: ");
        int third = sc.nextInt();

        if (first == second && first == third && second == third) {
            System.out.print("It is a Equilateral triangle: ");
        } else if (first == second && second == first) {
            System.out.print("It is a Isosceles triangle: ");

        } else
            System.out.print("It is a Scalene triangle: ");
    }
}
