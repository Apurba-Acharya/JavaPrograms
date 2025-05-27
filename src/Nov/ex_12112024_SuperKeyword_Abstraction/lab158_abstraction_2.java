package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab158_abstraction_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();
    }
}

class Child extends Father { //Child class
    @Override
    void loan50k() { //Child behaviour
        System.out.println("I'm paying -- > loan50k");
    }
}

abstract class Father{ //Prenent class
    abstract void loan50k();
    void loan25k(){   //Behaviour
        System.out.println("Paid by --> Father");
    }
}