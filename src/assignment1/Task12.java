package assignment1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Roll: ");
        int roll = sc.nextInt();
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Enter your Nationality: ");
        String nationality = sc.next();

        System.out.println("Roll No: " + roll +","+ " Name: " + name + "," + " Nationality: " + nationality);

    }
}

