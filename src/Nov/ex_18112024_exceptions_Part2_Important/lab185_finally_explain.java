package Nov.ex_18112024_exceptions_Part2_Important;

import java.util.Scanner;

public class lab185_finally_explain {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Successfully sc Closed");
        }
    }
}
