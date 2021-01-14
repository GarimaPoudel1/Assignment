package assignment1;

import java.util.Scanner;
public class Task6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = scanner.nextDouble();
        double perimeter = (2 * 22 * r) / 7;
        System.out.println("Perimeter of circle is: " + perimeter);

        System.out.print("Enter the side1 : ");
        int a = scanner.nextInt();
        System.out.print("Enter the side2 : ");
        int b = scanner.nextInt();
        System.out.print("Enter the side3 : ");
        int c = scanner.nextInt();
        double tri = (a+b+c);
        System.out.println("Perimeter of triangle is: " + tri);

        System.out.print("Enter the length : ");
        int l = scanner.nextInt();
        System.out.print("Enter the breadth : ");
        int br = scanner.nextInt();
        double rect = 2*(l+br);
        System.out.println("Perimeter of triangle is: " + rect);

    }
}



