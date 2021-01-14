package assignment1;

import java.util.Scanner;
public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter celcius: ");
        int inCelcius = scanner.nextInt();
        double farenheit = inCelcius * 1.8 + 32;
        System.out.println("The degree in fahreneit is : " + farenheit);
        System.out.print("Enter Farenheit: ");
        int inFarenheit = scanner.nextInt();
        double celcius = (inFarenheit - 32) * (0.55555556);
        System.out.println("The degree in celcius is : " + celcius);

    }
}



