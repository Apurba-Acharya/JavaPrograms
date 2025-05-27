package Nov.ex_22112024_MapCollectionFramework_Importance;

import java.util.HashMap;
import java.util.Map;

public class lab217_MapP1_Importance {
    public static void main(String[] args) {
        //Map is key value pair

        Map m1 = new HashMap(); //Generics

       // Map <String,Object> m1 = new HashMap(); // data type fixed
        //Object is can allow both String and Integer

        m1.put("name","pramod");
        m1.put("rollNo",125);
        m1.put("phone",1236589);
        System.out.println(m1);
    }
}
