package assignment1;
import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
            String a, b = "";
            Scanner str = new Scanner(System.in);
            System.out.print("Enter the string: ");
            a = str.nextLine();
            int n = a.length();
            for(int i = n - 1; i >= 0; i--)
            {
                b = b + a.charAt(i);
            }
            if(a.equalsIgnoreCase(b))
            {
                System.out.println("The string is palindrome.");
            }
            else
            {
                System.out.println("The string is not palindrome.");
            }
        }
    }


