package Oct.ex_23102024_Functions;

import java.util.Scanner;

public class lab114_2 {
    public static int multiply (int c , int d) {
        int result = c * d;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();

        int result1 = multiply(c,d);
        System.out.println(result1);
    }
}
