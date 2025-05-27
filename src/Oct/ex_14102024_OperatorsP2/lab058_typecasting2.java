package Oct.ex_14102024_OperatorsP2;

public class lab058_typecasting2 {
    public static void main(String[] args) {
        long phno = 958756288;
        //
       // short s = phno; >> implict not possible by JVM
        short s = (short)phno; //explicit possible but user will loose data
        System.out.println(s);
    }
}
