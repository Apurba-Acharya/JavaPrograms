package Nov.ex_06112024_Constructors;

import java.util.Scanner;

public class lab143_ParameterizeConstuctorP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bus b1 = new bus("panth", 4);
        System.out.println(b1.driver + " || " + b1.wheel);
        b1.display();

        System.out.print("Enter driver name: ");
        String driver_d = sc.next();
        System.out.print("Enter wheel number: ");
        int wheel_w = sc.nextInt();
        bus b2 = new bus(driver_d, wheel_w);
        System.out.println(b2.driver + " || " + b2.wheel);
        b2.display();
    }
}

class bus { //Class
    //Attributes
    int wheel;
    String driver;

    bus(String driver_d,int wheel_w){ //Parameterized constructor
        System.out.println("wheel-1");
        this.wheel = wheel_w;
        this.driver = driver_d;
    }
    void display(){  //Behaviours
        System.out.println("Display all -> " + this.wheel + " " + this.driver);
    }
}
