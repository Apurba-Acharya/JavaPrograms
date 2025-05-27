package Task;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q31_UniqueChractersInAString {

    //Find the unique chracters in a string

    public static void main(String[] args) {
        String str = "aaggttbujj";

        //HashMap:
        char[] chrac = str.toCharArray();
        Map <Character , Integer> charCount = new HashMap<>();
        for (char ch : chrac){
           if (!charCount.containsKey(ch)){
               charCount.put(ch,1);
           }
        }
        System.out.println("HashMap: " + charCount.keySet());

        //HashSet: T1:
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println("HashSet (T1): " + set);

        //HashSet: T2:
        char[] cArray = str.toCharArray();
        Set <Character> hs = new HashSet<>();
        String uWrords = "";
        for (char c : cArray){
            if (hs.add(c)==true){
                uWrords = uWrords + c;
            }
        }
        System.out.println("HashSet (T2): " + uWrords);
    }
}