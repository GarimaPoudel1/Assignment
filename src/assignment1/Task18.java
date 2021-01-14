package assignment1;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first value: ");
        int first = sc.nextInt();

        System.out.print("Please enter second value: ");
        int second = sc.nextInt();

        System.out.print("Please enter third value: ");
        int third = sc.nextInt();

        if( first > second && first > third)
        {
            System.out.print("The largest value is : "+first);
        }
        else if (second > third)
        {
            System.out.print("The largest value is : "+second);
        }
        else
            System.out.print("The largest value is : "+third);

    }
}
