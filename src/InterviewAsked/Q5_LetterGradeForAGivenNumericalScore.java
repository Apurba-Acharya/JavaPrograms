package InterviewAsked;

import java.util.Scanner;

public class Q5_LetterGradeForAGivenNumericalScore {

    /* Write a program that calculates and displays the letter grade
    for a given numerical score (e.g., A, B, C, D, or F) based on
    the following grading scale: */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();
        String grade;
        if (score>=90 && score<=100) {
            grade = "A";
        }else if (score>=70 && score<=89){
            grade = "B";
        }else if (score>=40 && score<=69){
            grade = "C";
        }else if (score>9 && score<=39){
            grade = "D";
        }else {
            grade = "Fail";
        }
        System.out.println("Your grade is: " + grade);
    }
}
