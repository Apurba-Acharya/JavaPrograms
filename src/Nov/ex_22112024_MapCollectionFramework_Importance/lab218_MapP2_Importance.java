package Nov.ex_22112024_MapCollectionFramework_Importance;

import java.util.HashMap;
import java.util.Map;

public class lab218_MapP2_Importance {
    public static void main(String[] args) {
        Map <String,Integer> m2 = new HashMap();

        m2.put("id", 1);
        m2.put("id", 2);
        m2.put("id2", 2);
        m2.put("id3", 37);
        m2.put("id4", null);
        m2.put("id5", null); //duplicate value allowed
        m2.put(null, 102);
        m2.put(null, 102); //duplicate key not allowed

        System.out.println("Printing key value pair in string: " + m2); // Order will not maintain
        System.out.println("Printing integer: " + m2.size());
        System.out.println("Boolean 1: " + m2.isEmpty());
        System.out.println("Boolean 2: " + m2.containsKey("id2"));
        System.out.println("Boolean 3: " + m2.containsValue(10));

        System.out.println("Printing keys in array format: " + m2.keySet());;
        System.out.println("Printing values in array format: " + m2.values());
        System.out.println("Printing value of defined key: " + m2.get("id3"));

    }
}
