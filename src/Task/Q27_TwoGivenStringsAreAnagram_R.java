package Task;

import java.util.Arrays;

public class Q27_TwoGivenStringsAreAnagram_R {

//    Check two given strings are anagram

    public static void main(String[] args) {
        String str1 = "stop";
        String str2 = "tops";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("String is anagram");
        }else {
            System.out.println("String is not anagram");
        }

        System.out.println("++++++++++++++++++++++++++++");

        //Example 2:
        String str3 = "lets learn java and selenium";
        String str4 = "jav and selenium learn lets";

        String s1[] = str3.split(" ");
        String s2[] = str4.split(" ");
        Arrays.sort(s1);
        Arrays.sort(s2);
        if (Arrays.equals(s1,s2)){
            System.out.println("Anagram sentence");
        }else {
            System.out.println("not Anagram sentence");
        }
    }
}
