package Lesson16Mentor.Exercise;

import java.util.Scanner;

public class AverageStudentPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = 0;
        int totalScore = 0;

        try {
            System.out.print("Neçə tələbə var?: ");
            countStudents = scanner.nextInt();
            if (countStudents <= 0) {
                throw new NumberFormatException("Sadəcə müsbət rəqəmləri daxil edin.");
            }

            for (int i = 1; i <= countStudents; i++) {
                System.out.print("Tələbənin imtahan nəticəsi: " + i + " - ");
                int score = scanner.nextInt();

                if (score < 0 || score > 100) {
                    throw new WrongNoteException("Sadəcə 0 və 100 arasında rəqəm daxil edin.");
                }

                totalScore += score;
            }

            int averagePoint = totalScore / countStudents;
            System.out.println("Ortalama bal: " + averagePoint);
        } catch (NumberFormatException e) {
            System.out.println("Problem 1: " + e.getMessage());
        } catch (WrongNoteException e) {
            System.out.println("Problem 2: " + e.getMessage());
        }
    }
}
