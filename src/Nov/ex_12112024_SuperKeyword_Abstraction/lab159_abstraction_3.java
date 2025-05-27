package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab159_abstraction_3 {
    public static void main(String[] args) {
        WagonR r = new WagonR();
        r.drive();

        lab159_Tesla T = new lab159_Tesla();
        T.drive();
    }
}

class WagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Engine");
    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}
