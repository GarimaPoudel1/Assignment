package assignment1;
import java.util.Arrays;

public class Task36 {
        public static void main(String[] args)
        {
            int[] my_array = {8, 2, 9, 5, 2, 9, 7, 8, 8};

            for (int i = 0; i < my_array.length-1; i++)
            {
                for (int j = i+1; j < my_array.length; j++)
                {
                    if ((my_array[i] == my_array[j]) && (i != j))
                    {
                        System.out.println("Duplicate Element : "+my_array[j]);
                    }
                }
            }
        }
    }

