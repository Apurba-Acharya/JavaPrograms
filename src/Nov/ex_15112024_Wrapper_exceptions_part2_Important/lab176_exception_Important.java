package Nov.ex_15112024_Wrapper_exceptions_part2_Important;

public class lab176_exception_Important {
    public static void main(String[] args) {


        //Checked: JVM knows it
        //FileInputStream file  = new FileInputStream("C://a.txt");
        //JVM knows that this may lead to file not found exception.
        //so it telling to handle it.


        //Unchecked: JVM does not knows it.
        int a  = 10;
        int b = 10;
        b = 0;
        int c = a/b;
        System.out.println(c);


    }
}
