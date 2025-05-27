package Task;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q15_CountVowelsAndConsonantsinAString_12 {

    /* Count vowels and consonants in a String */

    public static void main(String[] args) {

        //Type 1:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string value: ");
        String string = sc.next();
        int vCount = 0;
        int cCount = 0;

        for(int i=0; i<string.length(); i++) {
            char ch = string.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if(ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);

        System.out.println("******************** End! ******************");

        //Type 2: Using HashSet:
        String str = "progrAAmming";
        String s = str.toLowerCase();
        String st [] = s.split(""); // char ch[] = s.toCharArray(); //Using this also possible

        Set <String> hs = new HashSet<>();
        hs.add("a");
        hs.add("e");
        hs.add("i");
        hs.add("o");
        hs.add("u");

        int vc = 0;
        int cc = 0;
        String vouels = "";
        for (int i = 0; i < st.length ; i++) {    //for ( String c : st)
            if (hs.contains(st[i])){
                vc++;
                vouels = vouels+st[i] + " "; // Vouels count.
            }else {
                cc++;
            }
        }
        System.out.println("HashSet vouels are: " + vc);
        System.out.println("Vouels are: " + vouels);
        System.out.println("HashSet consonents are: " + cc);
    }
}