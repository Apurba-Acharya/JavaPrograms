package Nov.ex_20112024_ListCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class  lab203_arrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jaam");
        list.add("butter");
        list.add("milk");
        list.add("jaam");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Normal for loop: " + list.get(i));
        }

        System.out.println("****Using for each loop: ");
        for (Object o: list){
            System.out.println("For each loop: " + o);
        }

        System.out.println("***Using for Iterator: ");
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println("Iterator: " + iter.next());
        }
    }
}
