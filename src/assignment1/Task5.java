package assignment1;

import java.util.Scanner;
public class Task5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double r = sc.nextDouble();
        double area = (22 * r * r) / 7;
        System.out.println("Area of circle: " + area);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double width = sc.nextDouble();
        double rect = length * width;
        System.out.println("Area of rectangle: " + rect);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double tri = (base*height)/2;
        System.out.print("Area of triangle: " + tri);

    }
}


