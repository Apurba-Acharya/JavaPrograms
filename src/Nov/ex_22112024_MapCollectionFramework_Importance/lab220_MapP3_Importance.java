package Nov.ex_22112024_MapCollectionFramework_Importance;

import java.util.HashMap;
import java.util.Map;

public class lab220_MapP3_Importance {
    public static void main(String[] args) {
        Map <String,Integer> m3 = new HashMap();

        m3.put("id", 2);
        m3.put("id2", 2);
        m3.put("id3", 37);
        m3.put("id4", null);
        m3.put("id5", null);
        m3.put(null, 102); //Key can not null

        for (Map.Entry<String,Integer> item: m3.entrySet()){   //key value combination is call entryset
            System.out.println(item.getKey() + item.getValue());
        }
    }

}
