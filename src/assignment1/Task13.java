package assignment1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int num = sc.nextInt();

        if(num >0) {
            System.out.print("Exit..");
            System.exit(0);
        }
        else{
            System.out.print(num);
        }

    }


}

