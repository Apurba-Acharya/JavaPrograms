package Oct.ex_15102024_Ternary;

public class lab062 {
    public static void main(String[] args) {

        //finds the largest of three integers >>>

        int a = 5;
        int b = 9;
        int c = 7;
        int i = (a>=b && a>=c) ? a : (b>=c ? b:c);
        System.out.println("print - " + i);
    }
}
