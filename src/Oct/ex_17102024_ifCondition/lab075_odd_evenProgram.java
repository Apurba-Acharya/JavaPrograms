package Oct.ex_17102024_ifCondition;

import java.util.Scanner;

public class lab075_odd_evenProgram {
    public static void main(String[] args) {
        //take user input and check wheather the input is even or a odd number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        // modulus > %
        // 10%2 == even = 0
        // 10%2 == odd = 1

        if (num%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("not even");
        }
    }
}
