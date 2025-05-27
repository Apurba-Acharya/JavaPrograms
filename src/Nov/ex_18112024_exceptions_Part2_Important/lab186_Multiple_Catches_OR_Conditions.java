package Nov.ex_18112024_exceptions_Part2_Important;

public class lab186_Multiple_Catches_OR_Conditions {
    public static void main(String[] args) {
        String ip = args [0];
        int a = Integer.parseInt(ip);
        int b = 0;
        try {
            b = 100/a;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
