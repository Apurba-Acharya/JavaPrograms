package InterviewAsked;

import java.util.Scanner;

public class Q3 {

    /* Write a program that prints numbers from 1 to 100.
    However, for multiples of 3, print "Fizz" instead of the number,
    and for multiples of 5, print "Buzz."
    For numbers that are multiples of both 3 and 5, print "FizzBuzz." */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter number: ");
        int b = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("FizzBuzz: " + i);
            } else if (i % a == 0) {
                System.out.println("Fizz: " + i);
            } else if (i % b == 0) {
                System.out.println("Buzz: " + i);
            }
        }

    }
}
