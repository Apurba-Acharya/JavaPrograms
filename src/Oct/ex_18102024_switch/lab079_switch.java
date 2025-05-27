package Oct.ex_18102024_switch;
 // Switch Condition
import java.util.Scanner;

public class lab079_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thr");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
        System.out.println("end");
        sc.close();
    }
}
