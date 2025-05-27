package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q23_DuplicateCharactersOnString_24 {

//    Find duplicate character on a string

    public static void main(String[] args) {
        String st = "seleniums";
        String str = st.toLowerCase();

        char arr[] = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {  //we can use: for (int i=0, i<arr.length; i++)
            if (!map.containsKey(c)) { //c r value jode map e aage theke naa thake tahole key = c ; value = 1 dao.
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        //Prining
        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " : " + map.get(key));
            }
        }

        //Using HashSet (.contains):
        char c1[] = str.toCharArray();
        Set<Character> s2 = new HashSet<>();
        for (char c2 : c1) {
            if (s2.contains(c2)) {
                System.out.println("Duplicates using .containes in HashSet:  " + c2);
            } else {
                s2.add(c2);
            }
        }

        //Using HashSet (.add):
        char c3[] = str.toCharArray();
        Set<Character> s3 = new HashSet<>();
        for (char c4 : c3) {
            if (s3.add(c4) == false) {
                System.out.println("Duplicates using .add in HashSet: " + c4);
            }
        }
    }
}
