package Oct.ex_24102024;

import java.util.Scanner;

public class lab114_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A No -> ");
        int a = sc.nextInt();
        System.out.println("Enter B No -> ");
        int b = sc.nextInt();

        int result = sum_of_numbers(a, b);
        System.out.println(result);
        int result2 = sub_of_numbers (a, b);
        System.out.println(result2);
    }
    static int sum_of_numbers(int a, int b){
        return a+b;
    }
    static int sub_of_numbers (int a, int b){
        return a-b;
    }
}


