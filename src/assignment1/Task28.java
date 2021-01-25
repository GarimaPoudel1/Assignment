package assignment1;

import java.util.Scanner;

public class Task28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int number =0;
        String  prime_Numbers = "";
        System.out.println("Please enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(number =i; number>=1; number--)
            {
                if(i%number==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                prime_Numbers = prime_Numbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are : "+ prime_Numbers);
    }
}
