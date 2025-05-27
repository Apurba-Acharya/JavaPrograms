package Nov.ex_22112024_MapCollectionFramework_Importance;

import java.util.Enumeration;
import java.util.Hashtable;

public class lab222_MapP5 {
    public static void main(String[] args) {
        Hashtable <Integer,String> ht1 = new Hashtable();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
//        ht1.put(1,null); //Not acceptable
//        ht1.put(null,"one");  //Not acceptable

        System.out.println(ht1);

        Enumeration <Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
