package Oct.ex_15102024_increment_decrement;

public class lab066 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a > a++ >> 10, a >> 11
        // b > ++a >> 12, a >> 12
        // c = 10 + 12 = 22
    }
}
