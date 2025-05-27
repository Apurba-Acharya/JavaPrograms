package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class lab207_linkList {
    public static void main(String[] args) {
        //LinkedList l1 = new LinkedList();
        List l2 = new LinkedList();
        l2.add(2);
        l2.add(9);
        l2.add(2);
        l2.add(5);
        System.out.println(l2);
        System.out.println(l2.get(3));
        Object o1 = l2.get(3);
        System.out.println(o1);

        List l3 = new ArrayList();
        l3.add(2);
        l3.add(9);
        l3.add(2);
        l3.add(5);
        System.out.println(l3);
    }
}
