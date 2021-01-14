package assignment1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pound: ");
        double pound = scanner.nextDouble();
        double lb = pound * 0.454;
        System.out.println("The entered pound in kg is : " + lb);

    }
}
