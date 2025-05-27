package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab213_SET_HSautomation_TS {
    public static void main(String[] args) {
        Set hs = new HashSet(); //hashing mechanism //Most important in automation
        hs.add("apple");
        hs.add("Orange");
        hs.add("banana");
        hs.add("Orange");
        hs.add(null); //Null acceptable
        hs.add(null); //Duplicate not acceptable
        System.out.println("Printing HashSet value: " + hs);

        //We can not use normal for loop in lhs
        //We can use for each loop
        Set lhs = new LinkedHashSet();
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("banana");
        lhs.add("Orange"); //Duplicate not acceptable
        lhs.add(null);  //Null acceptable
        System.out.println("Printing LinkedHashSet value: " + lhs);
        System.out.println("Boolean 1 = " + lhs.isEmpty());
        System.out.println("Boolean 2 = " + lhs.contains("apple"));
        System.out.println("Integer Output = " + lhs.size());

        //Set ts = new TreeSet();
        //ts : Order can not maintain.
        Set <String> ts = new TreeSet(); //can use
        ts.add("apple");
        ts.add("Orange");
        ts.add("banana");
        ts.add("Orange"); //Duplicate not acceptable
//      ts.add(125); // Not allowed different data type
//      ts.add(null); //Null Not allowed

        System.out.println("Printing TreeSet value: " + ts);
        for (Object o: ts) {
            System.out.println("Printing TreeSet value using for loop: " + o);
        }
    }
}
