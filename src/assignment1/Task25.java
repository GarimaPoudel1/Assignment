package assignment1;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highest_Score=0;
        String highestScoreName = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter each student’s name and score: ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) +
                            "\n   Name: ");
            String name = input.next();
            System.out.print(
                    "   Score: ");
            int score = input.nextInt();


            if (score > highest_Score)
            {
                highest_Score = score;
                highestScoreName = name;
            }

        }

        System.out.println("Student with the highest score: " + highestScoreName);
    }
}

