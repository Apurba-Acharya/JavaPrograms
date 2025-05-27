package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab160_Interface_P2 {
    public static void main(String[] args) {
        P p = new P ();
        p.f3();
    }
}

class P implements I1{
    @Override
    public void f1() {
        System.out.println("calling f1 done");
    }

    @Override
    public void f2() {
        System.out.println("calling f2 done");
    }
    void f3(){
        f1();
        f2();
    }
}

interface I1{
    void f1();
    void f2();
}