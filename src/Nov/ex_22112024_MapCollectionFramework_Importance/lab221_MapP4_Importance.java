package Nov.ex_22112024_MapCollectionFramework_Importance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lab221_MapP4_Importance {
    public static void main(String[] args) {
        Map<String,Object> s1 = new HashMap();
        s1.put("name","Dev");
        s1.put("phone",4569875);
        s1.put("address","bangalore");
        System.out.println(s1);

        Map<String,Object> s2 = new HashMap();
        s2.put("name","Dev");
        s2.put("phone",4569875);
        s2.put("address","bangalore");
        System.out.println(s2);

        List students = new ArrayList();
        students.add(s1);
        students.add(s2);
        System.out.println(students);
    }
}
