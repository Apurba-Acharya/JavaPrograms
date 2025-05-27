package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab212_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();

        hs.add("Amit");
        hs.add("Amit");
        hs.add("amit");
        hs.add("Dmit");
        System.out.println(hs);

    }
}
