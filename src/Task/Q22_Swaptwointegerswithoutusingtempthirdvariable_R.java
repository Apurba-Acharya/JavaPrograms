package Task;

public class Q22_Swaptwointegerswithoutusingtempthirdvariable_R {

    /* Swap two integers without using temp/third variable */

    public static void main(String[] args) {
       String a  = "Hello";
       String b  = "World";
        System.out.println("Before swaping: ");
        System.out.println("the value of a is: " + a);
        System.out.println("the value of b is: " + b);

        //1. Append a and b:
        a = a+b;
        System.out.println("Append: " + a);

        //2. Store initial string a in string b:
        b = a.substring(0,a.length()-b.length()); //a.length()-b.length() : HelloWorld - World
        System.out.println("b: " + b);

        //3. Store initial string b in string a:
//        a.substring(b.length())
//        1. We take a substring of a starting from index b.length() (which is 5).
//        2. a.substring(5) means we extract everything from index 5 to the end of the string.
        a = a.substring(b.length());
        System.out.println("a: " + a);
    }
}
