package assignment1;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int num,sum,total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            total = total + i;
        }

        System.out.println("Sum of first "+n+" natural numbers is: "+total);
    }
}

