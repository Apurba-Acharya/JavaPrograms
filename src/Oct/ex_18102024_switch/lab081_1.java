package Oct.ex_18102024_switch;

import java.util.Scanner;

public class lab081_1 {
    public static void main(String[] args) {
        //web automation example
        Scanner sc = new Scanner(System.in);
        System.out.println("enter browser");
        String bro = sc.next();
        bro = bro.toLowerCase(); //case sensitive (upper case or lower case can accept)
        switch (bro){
            case "chrome":
                System.out.println("start chrome");
                System.out.println("....");
                break;
            case "edge":
                System.out.println("start edge");
                System.out.println("..g.");
                break;
            case "firefox":
                System.out.println("start firefox");
                System.out.println(".ff.");
                break;
            default:
                System.out.println("no idea");
                break;
        }
    }
}
