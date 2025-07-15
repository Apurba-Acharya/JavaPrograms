package Task;

import java.util.Scanner;

public class Q6_LeapYear {

    /* Create a program that determines whether a given year is a leap year.
    A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
    Use an if-else statement to make this determination. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int year = sc.nextInt();
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("This is a leap year: " + year);
        } else {
            System.out.println("Not a leap year");
        }
    }
}
