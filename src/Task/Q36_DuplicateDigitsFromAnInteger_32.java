package Task;

import java.util.*;

public class Q36_DuplicateDigitsFromAnInteger_32 {
    public static void main(String[] args) {
        int i = 95332009;
        String str = String.valueOf(i);
        String split[] = str.split("");

        Set<String> hs = new HashSet<>();
        for (String digits : split){
            if (hs.add(digits)==false){
                System.out.println(digits);
            }
        }
    }
}