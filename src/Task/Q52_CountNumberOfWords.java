package Task;

import java.util.StringTokenizer;

public class Q52_CountNumberOfWords {
    public static void main(String[] args) {
        String str = " hello a word I am Java ";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());
    }
}
