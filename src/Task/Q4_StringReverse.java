package Task;

public class Q4_StringReverse {

    /* Reverse String */

    public static void main(String[] args) {

        String s  = "Selenium";

        //1. using for loop >>
        int len = s.length();
        for (int i = len-1; i>=0; i--){
            System.out.print("Rev using for loop: " +s.charAt(i));
        }
        System.out.println();

        //using string buffer class:
        //String > immutable and don't have reverse function
        //String Buffer > mutable and have reverse function
        StringBuffer sf = new StringBuffer(s);
        System.out.println("Using stringBuffer: " + sf.reverse());

        // using Array:
        String s1[] = s.split("");
        String rev = "";
        for (int i= s1.length-1; i>=0 ; i--) {
            rev = rev + s1[i];
        }
        System.out.println("Rev using Array: " +rev);
        }
    }
