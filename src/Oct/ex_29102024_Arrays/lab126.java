package Oct.ex_29102024_Arrays;

import java.util.Scanner;

public class lab126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int size = sc.nextInt();
        int [] marks = new int[size];

        for (int i=0; i<size; i++){
            System.out.println("Enter Numbers:");
            marks [i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i=0; i<marks.length; i++){
            if (marks[i] == x){
                System.out.println("Found "+i);
            }
        }
    }
}
