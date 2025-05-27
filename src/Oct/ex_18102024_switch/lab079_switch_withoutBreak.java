package Oct.ex_18102024_switch;
 // Switch Condition
import java.util.Scanner;

public class lab079_switch_withoutBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("tue");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thr");
            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default:
                System.out.println("Nothing");
        }
        System.out.println("end");
        sc.close();
    }
}