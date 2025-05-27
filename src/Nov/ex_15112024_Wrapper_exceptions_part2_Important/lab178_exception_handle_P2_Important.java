package Nov.ex_15112024_Wrapper_exceptions_part2_Important;

public class lab178_exception_handle_P2_Important {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("***NullPointerException - Handled using try catch block");
        }
        System.out.println(b);
    }
}
