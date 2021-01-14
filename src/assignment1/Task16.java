package assignment1;
import java.util.Scanner;


public class Task16 {
    public static void main(String[]arg){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a number: ");
        int num= sc.nextInt();

        if(num%2 ==0) {
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");


        }
    }
}

