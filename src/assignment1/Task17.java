package assignment1;

import java.util.Scanner;

public class Task17 {
    public static void main(String[]arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year= sc.nextInt();

        if((year %4==0 && year %100!=0 ) || year %400==0){
            System.out.print("It is a leap year. ");
        }
        else{
            System.out.print("It is not a leap year. ");

        }




    }
}


