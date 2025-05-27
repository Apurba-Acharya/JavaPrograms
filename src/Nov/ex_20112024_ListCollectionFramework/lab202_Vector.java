package Nov.ex_20112024_ListCollectionFramework;

import java.util.Vector;

public class lab202_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("pramod");
        v.add("Lucky");
        v.add("amit");
        System.out.println(v);

        v.remove("pramod");
        System.out.println(v.contains("amit"));
        v.add("name");
        System.out.println(v);

    }
}
