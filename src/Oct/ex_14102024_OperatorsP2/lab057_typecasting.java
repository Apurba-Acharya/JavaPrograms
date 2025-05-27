package Oct.ex_14102024_OperatorsP2;

public class lab057_typecasting {
    public static void main(String[] args) {
    // type casting
    // widening - implicit, explicit - lossless
    // narrowing - implicit, ecplict(with data type), loss

        //widening >>
        byte b = 10;
        int a = b; //valid sintax >> implict casting by JVM
        int a1 = (int)b; //valid sintax >> explict calueasting by JVM
        System.out.println(a1);

        //Narrowing >> converting large data type to small
        int val = 200;
        //byte b2 = val; //invalid - implict by JVM
        byte b3 = (byte)val; //valid explict by JVM
        System.out.println(b3);
    }
}
