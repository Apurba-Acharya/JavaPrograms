package Task;

import java.util.HashSet;
import java.util.Set;

public class Q20_DuplicatesWordsinStringArray_23 {

    /* How to Find Duplicates Elements in Java Array? */

    public static void main(String[] args) {
        String names[] = {"c", "Java", "Ruby", "Python", "Java", "c"};

        //1. Compare each element using for loop:
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate (Compare each element): " + names[i]);
                }
            }
        }
        System.out.println("***************-**************");

        //2. Using HashSet:
        Set <String> store = new HashSet(); //Set: Interface > from parent class; HashSet(): Child class
        for (String name : names){
            if (store.add(name) == false){
                System.out.println("Duplicate (hashSet): " + name);
            }
        }
    }
}
