package assignment1;

import java.util.Scanner;
public class Task10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial velocity: ");
        double u = sc.nextDouble();
        System.out.print("Enter acceleration: ");
        double a = sc.nextDouble();
        System.out.print("Enter time: ");
        double t = sc.nextDouble();
        double distance =u*t+ (0.5)*a*t*t;
        System.out.print (" The distance is : "+distance);


    }
}
