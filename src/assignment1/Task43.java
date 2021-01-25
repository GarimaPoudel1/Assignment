package assignment1;

public class Task43 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        try {
            System.out.println("Division of a and b is:" + (a / b));
        }
        catch(ArithmeticException e) {
            System.out.println("Divisible is not possible");
        }
    }

}

