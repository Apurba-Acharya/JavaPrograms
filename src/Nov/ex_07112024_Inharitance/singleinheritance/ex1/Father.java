package Nov.ex_07112024_Inharitance.singleinheritance.ex1;

public class Father {    //Super class
    //Attribute
    int gold_f;

    Father(){   //Default constructor
        gold_f = 2000;
    }
    public Father(int gold_f) { //parametrized constructor
        this.gold_f = gold_f;
    }
    void bhk2(){ //Behaviour
        System.out.println("Father bihaviour: 2BHK");
    }
}
