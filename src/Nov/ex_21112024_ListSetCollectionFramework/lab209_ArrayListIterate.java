package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab209_ArrayListIterate {
    public static void main(String[] args) {
        List <String> a1 = new ArrayList();
        a1.add("pre");
        a1.add("post");
        a1.add("ost");
        System.out.println("Printing ArrayList type: 1 -- >");
        for (String str: a1){
            System.out.println(str);
        }
        System.out.println("Printing ArrayList type: 2 -- >");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        System.out.println("Printing ArrayList type: 3 -- >");
        Iterator <String> i1 = a1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
