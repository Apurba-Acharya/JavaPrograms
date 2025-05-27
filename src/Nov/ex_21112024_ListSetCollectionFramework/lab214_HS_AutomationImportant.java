package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.HashSet;

public class lab214_HS_AutomationImportant {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();
        set.add("Orange");
        set.add("OrAnge");
        set.add("Orange");
        set.add("Banana");
        set.add("Apple");
        set.add(null);
        System.out.println("Set elements: " + set);

        for (Object O : set){
            System.out.println(O);
        }
    }
}
