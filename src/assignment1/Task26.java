package assignment1;

import java.util.Scanner;
public class Task26 {
    public static void main(String[]args) {
        int rev = 0;
        //int numb=0;

        System.out.println("Please enter a number: ");
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }

        while (num !=0)
        {
            rev = rev * 10;
            rev = rev + num%10;
            num = num / 10;

        }
        System.out.println("The reverse of: "+ rev);
    }


}

