package Oct.ex_17102024_ifCondition;

import java.util.Scanner;

public class lab072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>20){
            System.out.println("allow");
        }
        else{
            System.out.println("not");
        }
    }
}
