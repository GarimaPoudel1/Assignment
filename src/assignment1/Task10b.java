package assignment1;

import java.util.Scanner;
public class Task10b {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter side one: ");
        double a = sc.nextDouble();
        System.out.print("Enter side two: ");
        double b = sc.nextDouble();
        System.out.print("Enter side three: ");
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        double area= Math.sqrt(s)*(s-a)*(s-b)*(s-c);
        System.out.print("Area of a triangle is: "+ area);

    }
}

