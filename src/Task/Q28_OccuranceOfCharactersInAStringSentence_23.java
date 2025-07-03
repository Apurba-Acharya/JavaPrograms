package Task;


import java.util.*;

public class Q28_OccuranceOfCharactersInAStringSentence_23 {
    public static void main(String[] args) {
        String str = "I love coding and I am so happy";
        String r = str.toLowerCase();
        String st = r.replaceAll(" ", "");
        char Char[] = st.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (char c : Char){
            if (hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }else {
                hm.put(c, 1);
            }
        }
        for (char c1 : hm.keySet()){
            System.out.println(c1 +" - "+hm.get(c1));
        }
    }
}
