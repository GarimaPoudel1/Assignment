package assignment1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159265359;

        System.out.print("Enter a radius : ");
        double radius = scanner.nextDouble();

        System.out.print("Enter a length :");
        double length = scanner.nextDouble();

        double volumeOfCylinder = PI * radius * radius * length;
        System.out.println("The volume of a cylinder is : " + volumeOfCylinder);
    }

}

