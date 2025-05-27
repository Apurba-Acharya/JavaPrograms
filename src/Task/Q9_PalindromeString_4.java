package Task;

public class Q9_PalindromeString_4 {

    /* Plalindrome String */

    public static void main(String[] args) {
        String str = "nitin";

        //Type 1: Using charAt():
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }

        //Type2: Using array:
        String st[] = str.split("");
        String reverse = ""; //For palindome checking purpose we are storing value outside the loop
        for (int i = st.length - 1; i >= 0; i--) {
            reverse = reverse + st[i];
            //System.out.print(st[i]); // Only for reverse a string we can use st[i].
        }
        if (str.equals(reverse)) {
            System.out.println("palindome");
        } else {
            System.out.println("not palindome");
        }

        //Type 3: Using StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        String s = String.valueOf(sbf.reverse()); //Main line
        if (s.equals(str)){
            System.out.println("Palindome");
        }else {
            System.out.println("Enter correct palindome");

        }
    }
}
