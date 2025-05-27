package Oct.ex_30102024_Arrays;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
