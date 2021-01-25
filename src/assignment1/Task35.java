package assignment1;
import java.util.Arrays;

public class Task35 {
        public static void main(String[] args) {
            int array[] = {10, 35, 1, 5, 64, 1};
            int n = array.length;
            Arrays.sort(array);
            System.out.println("Sorted Array ::"+Arrays.toString(array));
            int next = array[n-2];
            System.out.println("Second largest number is: "+ next);
        }
    }

