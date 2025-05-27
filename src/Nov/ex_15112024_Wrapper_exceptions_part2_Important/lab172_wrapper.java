package Nov.ex_15112024_Wrapper_exceptions_part2_Important;

public class lab172_wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //>>boxing (premitive to Integer)
        System.out.println(b.MIN_VALUE);
        System.out.println(b.MAX_VALUE);
        b.intValue();


        Integer a2 = 42;
        int value = a2;
        System.out.println(value);
    }
}
