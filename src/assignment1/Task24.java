package assignment1;

import java.util.Scanner;
public class Task24 {
    static int factorial = 1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        System.out.println("Factorial of "+number+" is: " + factorial);

    }
}



