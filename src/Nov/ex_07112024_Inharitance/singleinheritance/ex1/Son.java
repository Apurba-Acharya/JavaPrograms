package Nov.ex_07112024_Inharitance.singleinheritance.ex1;

public class Son extends Father {   //child class


    void bhk3(){ //Child behavior
        System.out.println("This is behaviour of child: 3BHK");
        System.out.println("This is attribute of father using in child behaviour (Default Constructor): " + gold_f); //
        bhk2(); //This is behaviour of father using in child behaviour
    }

    public static void main(String[] args) { //Runner class
        Father f = new Father(20); //Object
        System.out.println("Value is printing through parameterised constructor: " + f.gold_f);
        f.bhk2();
    }
}
