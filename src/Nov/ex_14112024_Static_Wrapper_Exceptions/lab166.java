package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class lab166 {
    public static void main(String[] args) {
        automation t1 = new automation();
        System.out.println(t1.driver);
        automation t2 = new automation();
        System.out.println(t2.driver);
        System.out.println("Calling static veariabe: " + automation.driver);
    }
}

class automation {
    static String driver = "chrome is starting!!!...";
}
