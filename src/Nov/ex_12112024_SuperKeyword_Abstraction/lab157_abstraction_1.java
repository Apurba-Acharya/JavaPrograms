package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab157_abstraction_1 {
    public static void main(String[] args) {
        apurba apu = new apurba();
        apu.loan30k();
        apu.loan50k();
    }
}

class apurba extends loan{
    @Override
    void loan50k() {
        System.out.println("Apurba giving loan!!! >> 50k");
    }
    @Override
    void loan30k() {
        System.out.println("Apurba giving loan!!! >> 30k");
    }
}

abstract class loan { //Abstract class
    //Abstract methods
    abstract void loan50k();
    abstract void loan30k();
}

//Concrete Class because no abstract methods present >
class Person {}
class student {}