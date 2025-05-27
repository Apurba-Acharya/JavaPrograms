package Oct.ex_15102024_increment_decrement;

public class lab065 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a); // A > a++ , B > a
        System.out.println(a);

        // A+B
        // A > a++ -> 10 -> a = 11,
        // line No. / Exp (result) / value
        //    5     /  NA         / 10
        //    6     /  11        / 10 + 11
    }
}
