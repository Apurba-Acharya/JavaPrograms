package Nov.ex_06112024_Constructors;

import java.util.Scanner;

public class lab143_ParameterizeConstuctorP2 { //Runner class
    public static void main(String[] args) {
        //Parameterized Constructor objects >>>
        Scanner sc = new Scanner(System.in);

        van t1 = new van("tata"); //Object 1
        System.out.println("*****Model1 Name: " + t1.model);
        t1.display2();

        van t2 = new van("nano",1250); //Object 2
        System.out.println("*****Model2 Name with Year: " + t2.model + " " + t2.year);
        t2.display1();

        System.out.print("Enter the model name: ");
        String model_name = sc.next();
        System.out.print("Enter the year: ");
        int year_create = sc.nextInt();
        van t3 = new van(model_name,year_create);  //Object 3
        System.out.println("*****Model3 Name with Year: " + t3.model + " " + t3.year);
        t3.display1();

        //Default Constructor object >>>
        van honda = new van();
        System.out.println("******" + honda.model + " > Manufactured year > " + honda.year);
        honda.display1();
    }
}

class van {   //Class

    //Atributes >>>
    String model;
    int year;

    //Parametrised Constructors type 1 >>>
    van(String model_name, int year_create){
        System.out.println("PC1");
        this.model = model_name;
        this.year = year_create;
    }

    //Parametrised Constructors type 2 >>>
    van(String model_name){
        System.out.println("PC2");
        this.model = model_name;
    }

    //Default constructor >>>
    van(){
        model = "Honda";
        year = 2000;
        System.out.println("DC is executed: ");
    }

    //Behaviours >>>
    void display1(){
        System.out.println("Car2 deatils -> " + this.model + " " + this.year);
    }
    void display2(){
        System.out.println("Car2 deatils -> " + this.model);
    }

}