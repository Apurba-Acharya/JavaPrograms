package Nov.ex_20112024_ListCollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lab207_arraySort_Reverse {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(52);
        list1.add(10);
        list1.add(13);
        System.out.println(list1);

        //Sort >>
        Collections.sort(list1);
        System.out.println("Sorting array: " + list1);

        //Reverse >>
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("Reverse array: " + list1);
    }
}
