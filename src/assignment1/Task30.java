package assignment1;

public class Task30 {
        public static void main(String[] args) {
            int count = 13, number1=1, number2=1;
            System.out.println("Fibonacci series of"+count+"numbers:");
            int i =1;
            while (i<count) {
                System.out.println(number1 + "");
                int sumofprevious = number1 + number2;
                number1 = number2;
                number2 = sumofprevious;
                i++;
            }

        }
    }

