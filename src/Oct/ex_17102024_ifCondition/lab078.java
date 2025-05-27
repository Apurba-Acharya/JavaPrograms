package Oct.ex_17102024_ifCondition;

import java.util.Scanner;

public class lab078 {
    public static void main(String[] args) {

        //the type of triangle based on its side lengths >>
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter s1 ");
        double s1 = sc.nextDouble();
        System.out.println("enter s2 ");
        double s2 = sc.nextDouble();
        System.out.println("enter s3 ");
        double s3 = sc.nextDouble();
        if (s1 <= 0 || s2 <= 0 || s3 <= 0){
            System.out.println("Invalid");
        }
        else if (s1 == s2 && s2 == s3 && s1 == s3) {
            System.out.println("EQU...");
        }
        else if (s1 == s2 || s2 == s3 || s1==s3){
            System.out.println("ISO...");
        }
        else {
            System.out.println("SCA...");
        }
    }
}
