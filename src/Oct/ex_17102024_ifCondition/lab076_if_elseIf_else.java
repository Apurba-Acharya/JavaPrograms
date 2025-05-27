package Oct.ex_17102024_ifCondition;

import java.util.Scanner;

public class lab076_if_elseIf_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no - 1 ");
        int a = sc.nextInt();
        System.out.println("no - 2 ");
        int b = sc.nextInt();
        //1st: a > b
        //2nd: a < b
        //3rd: a == b
        if (a>b){
            System.out.println("done a>b");
        }
        else if(a<b){
            System.out.println("done a<b");
        }
        else {
            System.out.println("done a=b");
        }
    }
}
