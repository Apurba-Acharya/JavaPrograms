package Nov.ex_22112024_MapCollectionFramework_Importance;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lab219_MapRealExample_Importance {
    public static void main(String[] args) {
        Map <String,Object> s1 = new HashMap();
        s1.put("name","Dev");
        s1.put("phone",4569875);
        s1.put("address","bangalore");
        System.out.println("Printing HashMap: " + s1);

        Set items = new HashSet();
        items.add("rich");
        System.out.println("Printing HashSet: " + items);

    }
}
