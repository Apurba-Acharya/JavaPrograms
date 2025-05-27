package Oct.ex_23102024_Functions;

import java.util.Scanner;

public class lab114 {
    public static int result (int a , int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = result(a,b);
        System.out.println(sum);
    }
}
