package Nov.ex_18112024_exceptions_Part2_Important;

public class lab196_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello");
        }

    }
}
