package assignment1;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first integer: ");
        int first = sc.nextInt();

        System.out.print("Please enter second integer: ");
        int second = sc.nextInt();

        System.out.print("Please enter arithmetic operation (+, -, *, /): ");
        char arith = sc.next().charAt(0);

        if (arith == '+') {
            int sum = first + second;
            System.out.println("Sum is: " + sum);

        } else if (arith == '-') {
            int subtraction = first - second;
            System.out.println("Subtraction is: " + subtraction);

        } else if (arith == '*') {
            int multiplication = first * second;
            System.out.println("Subtraction is: " + multiplication);

        } else if (arith == '/') {
            int division = first / second;
            System.out.println("Subtraction is: " + division);
        }
        else{
            System.out.println("The input is not an operator");
        }

    }

}


