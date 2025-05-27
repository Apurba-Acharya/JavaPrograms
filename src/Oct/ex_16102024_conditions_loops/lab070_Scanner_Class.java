package Oct.ex_16102024_conditions_loops;

import java.util.Scanner;

public class lab070_Scanner_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age\n");
        int age = scanner.nextInt();
        System.out.println(age>25 ? "allow":"not allowed");
        scanner.close();
    }
}
