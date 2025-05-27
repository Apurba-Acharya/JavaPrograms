package Nov.ex_20112024_ListCollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lab201_Lists {
    public static void main(String[] args) {
        List mylist = new ArrayList(); // storing data in arrays format >> continuous memory
        List mylist2 = new LinkedList(); // storing data in >> doubly linked list


        List fruits = List.of("orange", "apple");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
//        fruits.add("mango"); //java.lang.UnsupportedOperationException
    }
}
