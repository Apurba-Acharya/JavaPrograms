package Task;

import java.util.Random;
import java.util.Scanner;

public class Q53_GenerateRandomStringWhoseLengthMoreThan6Chrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of random string: ");
        int length = sc.nextInt();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }

        System.out.println("Random String: " + sb.toString());
    }
}
