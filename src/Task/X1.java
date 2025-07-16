package Task;

import java.util.HashMap;
import java.util.Map;

public class X1 {
    public static void main(String[] args) {
        String st = "seleniums";
        String str = st.toLowerCase();

        char arr[]=str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c:arr){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }
        }
        for(Character key: map.keySet()){
            if (map.get(key)>1) {
                System.out.println(key + map.get(key));
            }
        }

    }

}
