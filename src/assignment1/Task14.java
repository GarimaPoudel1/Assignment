package assignment1;
import java.util.Scanner;

public class Task14 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Integer: ");
        int first = sc.nextInt();

        System.out.println("Enter Second Integer: ");
        int second = sc.nextInt();

        if(first>second){
            System.out.println("First integer is greater than second integer: ");
        }

        else if(first<second){
            System.out.println("First integer is smaller than second integer: ");
        }

        else {
            System.out.println("First integer is equal to second integer: ");


        }

    }
}

