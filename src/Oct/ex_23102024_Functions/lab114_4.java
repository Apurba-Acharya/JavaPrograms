package Oct.ex_23102024_Functions;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class lab114_4 {
    public String main2(String a , String b) {
        String R = a.concat(b);
        return R;
    }
    public String main3(String c) {
        String D = c.toUpperCase();
        return D;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        lab114_4 obj1 = new lab114_4();
        String F = obj1.main2(a,b);
        String G = obj1.main3(c);
        System.out.println("PRINT "+F);
        System.out.println("PRINT "+G);
    }
}