package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab159_Tesla extends Engine{
    @Override
    void startEngine() {
        System.out.println("Starting Electric ENgg...");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Electric ENgg...");
    }

    void drive(){
        startEngine();
        stopEngine();
    }

    public static void main(String[] args) {
        lab159_Tesla T = new lab159_Tesla();
        T.drive();
    }
}
