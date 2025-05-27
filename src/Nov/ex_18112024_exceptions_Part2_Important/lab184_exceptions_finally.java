package Nov.ex_18112024_exceptions_Part2_Important;

public class lab184_exceptions_finally {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I'll be always executed");
        }
    }
}

