package assignment1;
import java.util.Scanner;

public class Task40 {
    public static void main(String args[])
    {
        String orig, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse: ");
        orig = in.nextLine();

        int length = orig.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + orig.charAt(i);

        System.out.println("Reverse of the string: " + reverse);
    }
}

