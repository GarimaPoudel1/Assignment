package assignment1;

import java.util.Scanner;
public class Task27 {
    public static void main(String[] args) {
        int r;
        int sum = 0;
        int product = 1;

        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        r = num % 10;
        sum = num + r;
        product = product * r;
        sum = num / 10;


        System.out.println("The sum  is: " + sum);
        System.out.println("The product is: " + product);
    }
}

