package Oct.ex_28102024_Strings_Funtions_Arrays;

public class lab124_StringBuilder_StringBuffer {
    //StringBuilder and (StringBuffer >> Thread safe)
    public static void main(String[] args) {
        StringBuffer stringbuf = new StringBuffer("Pramod");
        stringbuf.append("dutta");
        System.out.println(stringbuf);

        StringBuilder stringbuil = new StringBuilder("Pramod");
        stringbuil.append("Vutta");
        System.out.println(stringbuil);
    }
}
