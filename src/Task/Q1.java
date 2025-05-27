package Task;

import java.util.Scanner;

public class Q1 {

    //How to Take Input from Users? >>>
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int a = sc.nextInt();
        System.out.println("your age : " + a);
        System.out.print("Enter your name : ");
        String b = sc.next();
        System.out.println("Enter your name : " + a + " " + b);
    }

}
