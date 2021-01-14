package assignment1;

import java.util.*;

public class Task11b {
    public static void main(String args[]) {
        int A, B;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Integer(A): ");
        A = in.nextInt();
        System.out.println("Enter Second Integer(B): ");
        B = in.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("After Swapping value");
        System.out.println("A = " + A + "\nB = " + B);
    }
}





