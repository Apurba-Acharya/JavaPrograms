package Oct.ex_29102024_Arrays;

import java.util.Scanner;

public class lab127_2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] index = new int [r] [c];

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                index [i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++) {
                if (index [i][j] == x){
                    System.out.println("found at location" + i +"," + j);
                }
            }
        }
    }
}
