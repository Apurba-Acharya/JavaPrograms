package InterviewAsked;

import java.util.Scanner;

public class Q2 {

    //Table Print using System.out.printf >>>
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int number = sc.nextInt();
        System.out.printf("%-10s %-10s%n", "number", "multiplication");
        /* >> String with 10 chracter: %-10s
           >> New line >> %n */
        for (int i = 1; i <= 19; i++) {
            /* >> Integer with 10 chracter: %-10d
           >> New line >> %n */
            System.out.printf("%-10d %-10d%n", i, number*i);
        }
    }
}
