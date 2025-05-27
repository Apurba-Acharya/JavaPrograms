package Nov.ex_15112024_Wrapper_exceptions_part2_Important;

public class lab175_exceptions_example_Important {
    public static void main(String[] args) {
        System.out.println("Start ->>");

        String ip = args[0]; //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 >
        int a = Integer.parseInt(ip); //java.lang.NumberFormatException: For input string: "god"
        int b = 1000/a; //java.lang.ArithmeticException: / by zero
        System.out.println(b);
        System.out.println("End...");

        String s1 = null ; //Unchecked:  java.lang.NullPointerException: Cannot invoke "String.trim()" because "s1" is null
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("can't possible");
        }

        int c = 0;
        int b1 = 0;
        try {
            b1 = 10/c;
        } catch (Exception e) {
            System.out.println("Not Possible 2");
        }
        System.out.println(b1);
    }
}
