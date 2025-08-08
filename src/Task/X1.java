package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class X1 {
    public static void main(String[] args) {
        int inputArr[] = {2,5,6,7,6,8,2,9,9};
//        Set<Integer> hs = new HashSet();
//        for(int i : inputArr){
//            if(!hs.add(i)){
//                System.out.println(i);
//            }
//        }

        Map<Integer,Integer> hmap = new HashMap();
        for(int ia:inputArr){
            if(hmap.containsKey(ia)){
                hmap.put(ia, hmap.get(ia)+1);
            }else{
                hmap.put(ia, 1);
            }
        }
        for (int a : hmap.keySet()){
            if (hmap.get(a)==1){
                System.out.println(a);
            }
        }
    }

}
