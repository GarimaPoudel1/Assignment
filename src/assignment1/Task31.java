package assignment1;
import java.util.Scanner;

public class Task31 {
    public static void main(String[] args){
        int i,j,k;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        k = in.nextInt();

        for(i=1;i<=k;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}


