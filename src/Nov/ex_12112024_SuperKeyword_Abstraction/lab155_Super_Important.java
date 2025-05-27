package Nov.ex_12112024_SuperKeyword_Abstraction;

public class lab155_Super_Important {   //Runner class
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.message();
        c.message("Executed");
    }

}
class Car extends Vehicle{ //Child Car class: Inharitance
    private int maxSpeed = 281; //Child Attribute

    @Override
    void display() {
        System.out.println("Child");
    }
    Car(){    //Default constructor

        super(8); //Parent Parametrized constructor calling
        //super(); //Parent default constructor calling

        System.out.println("DC Car");
        System.out.println(this.maxSpeed); //>> Child max speed calling
        System.out.println(super.maxSpeed); //>> parent max speed claiing
        this.display(); //Child behaviour calling
        super.display(); // Parent behaviour calling
    }
}

class Vehicle{ //Parent class
    public int maxSpeed = 180; //Attribute

    void display (){  //Behaviour
        System.out.println("Parent");
    }
    Vehicle (){ //default constructor
        System.out.println("DC -> Vehicle");
    }
    Vehicle (int a){ //parameterised constructror
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