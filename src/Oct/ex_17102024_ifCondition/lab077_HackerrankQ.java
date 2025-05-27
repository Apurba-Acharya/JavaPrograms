package Oct.ex_17102024_ifCondition;

import java.util.Scanner;

public class lab077_HackerrankQ {
    public static void main(String[] args) {
        // Grade Calculator:
        //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        if (score1 >= 90 && score1 <= 100){
            System.out.println("Grade - A");
        }
        else if (score1 <=89 && score1 >= 80){
            System.out.println("Grade - B");
        }
        else if (score1 <=79 && score1 >= 70){
            System.out.println("Grade - C");
        }
        else if (score1 <=69 && score1 >= 60){
            System.out.println("Grade - D");
        }
        else if (score1 <=0 || score1 > 100){ //edge case
            System.out.println("XXX");
        }
        else{
            System.out.println("Grade - Fail");
        }
    }
}
