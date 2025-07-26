package Oct.ex_19102024_Variables;

public class Variables {
    /* >> Java is a statically types language, so we must declare the type of data a variable will store.

    int no = 10;
    no = variable
    int  = data type
    10 = value of the variable;

    >> The value stored in a variable can change during program execution.
       no = no+10;

    Types of variables:
    1. Local variables: It can create and use within that methods/constructors/blocks only. Outside of the method local variable can't work.
    *Access modifiers (Public/Private/Default/Protected) can't use with local variables.

    2. Instance variables: Instance variable can create within a class. Can be declared outside of methods/constructors/blocks. it can be use within all methods/constructors/blocks
    coming under that perticuler class.
    *Instance variable can't create within static methods
    *Access modifiers (Public/Private/Default/Protected) can be used with local variables.
    
    3. Static variables: Declared at class level with static keyword and outside the methods/constructors/blocks.
    *Access modifiers (Public/Private/Default/Protected) can be used with local variables.
    */

    int no = 100; // Instance variable
    void m1(){
        int no1 = 10; // local variable
        System.out.println(no+no1); // [Local + Instance]
    }
    void m2(){
        int no2 = 20; // local variable
        System.out.println(no+no2); // [Local + Instance]
    }

    //Static Variables:
    static int no3 = 100;
    void m3(){
        System.out.println(no3+10);
    }
    static void m4(){
        System.out.println(no3+20);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.m1();
        obj.m2();

        //Static Variables:
        obj.m3();
        Variables.m4();
    }
}
