package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab155_Super_Important {   //Runner class
    public static void main(String[] args) {
        child_Car c = new child_Car();
        c.display();
        c.message();
        c.message("Executed");
    }

}
class child_Car extends Parent_Vehicle{ //Child Car class: Inharitance
    private int maxSpeed = 281; //Child Attribute

    @Override
    void display() {
        System.out.println("Child");
    }
    child_Car(){    //Default constructor

        super(8); //Parent Parametrized constructor calling
        //super(); //Parent default constructor calling

        System.out.println("DC Car");
        System.out.println(this.maxSpeed); //>> Child max speed calling
        System.out.println(super.maxSpeed); //>> parent max speed claiing
        this.display(); //Child behaviour calling
        super.display(); // Parent behaviour calling
    }
}

class Parent_Vehicle{ //Parent class
    public int maxSpeed = 180; //Attribute

    void display (){  //Behaviour
        System.out.println("Parent");
    }
    Parent_Vehicle (){ //default constructor
        System.out.println("DC -> Vehicle");
    }
    Parent_Vehicle (int a){ //parameterised constructror
        System.out.println("PC : Vehicle");
    }

    //method overloading
    void message (){
        System.out.println("Hello Vehicle");
    }
    void message (String a){
        System.out.println("Parent Method Overloading Executed");
    }
}