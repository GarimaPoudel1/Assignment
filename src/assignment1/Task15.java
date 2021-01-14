package assignment1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter an ASCII code: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println("The character for ASCII code " + num + " is "
                + (char) num);
    }


}

