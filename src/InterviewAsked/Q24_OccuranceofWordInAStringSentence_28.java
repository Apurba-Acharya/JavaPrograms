package InterviewAsked;

import java.util.HashMap;
import java.util.Map;

public class Q24_OccuranceofWordInAStringSentence_28 {
//    Occurance of Word In A String

    public static void main(String[] args) {
        String str = "I am learning learning java java programming";

        String[] words = str.split(" "); //Based on the space split each word from the string and store it in words array.
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) { //containsKey (): return boolean.

                //String: word > Key
                //Integer: wordCount.get(word) + 1 > value
                // learning keyword in 2nd time: wordCount.get(word) value was 1 and to count the 2nd time value +1

                wordCount.put(word, wordCount.get(word) + 1); // wordCount.get(word): return = Integer
            } else {
                wordCount.put(word, 1);
            }
        }
        for (String x : wordCount.keySet()) { //keySet(): can fetch only keys in array format
            System.out.println("Count: " + x + " = " + wordCount.get(x));
        }
    }
}
