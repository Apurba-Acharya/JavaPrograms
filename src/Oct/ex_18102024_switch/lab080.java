package Oct.ex_18102024_switch;

import java.util.Scanner;

public class lab080 {
    public static void main(String[] args) {
        int itemcode = 003;
        int item = 002;
        switch (itemcode){
            case 001, 002, 003:
                System.out.println("all gadgets");
                break;
            case 004, 006, 010:
                System.out.println("all elects");
                break;
            default:
                System.out.println("nothing");
                break;

        }
    }
}
