package Nov.ex_06112024_Constructors;

public class Car_DefaultConstructor {
    //Attributes >>>
    String model;
    int year;
    String name;

    //***constructor name should be same as class name
    //Default Constructor >>
    Car_DefaultConstructor(){
     name = "unknwn";
     model = "xyz";
     year = 1997;
     System.out.println("DC is executed");
    }
}
