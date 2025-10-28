package InterviewAsked;

public class Q21_StringManipulationinJava {

    /* String Manipulation in Java */

    public static void main(String[] args) {
        String str = "The rains have started here selenium";
        System.out.println("Printing length of string: " + str.length());

        System.out.println("Position of a chracter: " + str.charAt(5)); //Important

        System.out.println("1st occurance of s: " + str.indexOf('s')); //1st occurance of s

        System.out.println("2nd occurance of s: " + str.indexOf('s', str.indexOf('s')+1)); // 2st occurance of s

        System.out.println("Index of word: " + str.indexOf("have")); //Index of word

        System.out.println("If any word is not available in given string then: " + str.indexOf("hello")); //If any word is not available then it should display -1

        String str2 = "The rains have started here selenium";
        System.out.println("String compairison 1: " + str==str2); //String compairison
        System.out.println("String compairison 2: " + str.equals(str2)); //String compairison

        String str3 = "The rains have started here SElenium";
        System.out.println("Compaire string without case sensitivity: " + str.equalsIgnoreCase(str3));

        // Substring should start from 1 to till the end...
        // In substring blank space should also take in valid count.
        System.out.println("Substring: " + str.substring(0,9)); //Substring: Part of a string

        //trim & replace:
        String s = "         hello World     ";
        System.out.println("Trim: " + s.trim());
        System.out.println("Replace: " + s.replace(" ",""));

        //replace
        String s1  = "01-01-2017";
        System.out.println("Replace: " + s1.replace("-","/"));

        //Split:
        String test = "Hello_World_Test_Selenium";
        String testVal [] = test.split("_");
        for (int i = 0; i < testVal.length; i++) {
            System.out.print(testVal[i]);
            System.out.print(" ");
        }
        System.out.println();

        //String Concatenation:
        String s2 = "cares";
        System.out.println("String Concatenation: " + s2.concat("AA"));


        //Important:
        String x  = "hello";
        String y  = "World";
        int a = 100;
        int b = 200;
        System.out.println("Type 1: " + x+y+a+b);
        System.out.println("Type 2: " + a+b+x+y);
        System.out.println("Type 3: " + x+y+(a+b));
    }
}
