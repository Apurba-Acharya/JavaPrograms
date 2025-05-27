package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class lab215_Vector {
    public static void main(String[] args) {
        Vector <String> v = new Vector();
        v.add("apple");
        v.add("Orange");
        v.add("banana");
        v.add("Orange");

        for (Object o: v){ //Object or String both allowed
            System.out.println(o);
        }

        //Iterator not possible in legacy classes
        //Enumerator is possible
        System.out.println("--------");
        Enumeration <String> enu = v.elements();
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
    }
}
