package assignment1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        float P,T,R, simple_interest;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        P = in.nextFloat();
        System.out.print("Enter Time: ");
        T = in.nextFloat();
        System.out.print("Enter Rate: ");
        R = in.nextFloat();
        simple_interest = (P*T*R)/100 ;
        System.out.print("Simple Interest: "+simple_interest);

    }
}

