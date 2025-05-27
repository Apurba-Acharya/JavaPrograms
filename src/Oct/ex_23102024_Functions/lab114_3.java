package Oct.ex_23102024_Functions;

import java.util.Scanner;

public class lab114_3 {
    public static void fact (int n) {
        int facto = 1;
        for (int i=n; i>=1; i--){
            facto = facto * i;
        }
        System.out.println(facto);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
