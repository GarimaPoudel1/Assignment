package assignment1;

import java.util.Scanner;
public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int numb = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = numb * i;
            System.out.println(result);
        }
    }
}
