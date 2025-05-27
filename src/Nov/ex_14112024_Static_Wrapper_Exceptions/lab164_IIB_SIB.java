package Nov.ex_14112024_Static_Wrapper_Exceptions;

import jdk.dynalink.beans.StaticClass;

public class lab164_IIB_SIB {
    public static void main(String[] args) {
        A a2 = new A();
        A a1 = new A();
        new A();
        A a3; // if only reference is created then SIB or IIB both will not be executed
    }
}
class A {
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }
}
