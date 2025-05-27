package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab160_Interface_P1 {
    public static void main(String[] args) {

    }
}

//Abstract class:
abstract class ABC{
    ABC(){  //Default constructor
        System.out.println("no issue constructor");
    }
    //For the abstract class both incomplete and complete method both are allowed.
    abstract void m1();  //incomplete method
    void m2(){ //Complete method
        System.out.println("complete Method !!!");
    }
}

//Interface:
interface I{
    void m1();
    void m2();

    //    void m3(){  //Complete function is not allowed in interface
    //    }
    //Using "default" and "static" keyword we can access a complete method in Interface
    default void m4(){
        System.out.println("default method 1");
    }
    default void m5(){
        System.out.println("default method 2");
    }
    static void m6(){
        System.out.println("static method in interface");
    }
}
