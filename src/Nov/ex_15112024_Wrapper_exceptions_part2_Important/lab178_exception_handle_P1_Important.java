package Nov.ex_15112024_Wrapper_exceptions_part2_Important;

public class lab178_exception_handle_P1_Important {
    public static void main(String[] args) {
        System.out.println("Start");
        String s1 = null; //NullPointerException
        //s1.trim(); // To resolve the NullPointerException use try catch.
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("***NullPointerException - Handled using try catch block");
        }
        System.out.println("End!!");
    }
}
