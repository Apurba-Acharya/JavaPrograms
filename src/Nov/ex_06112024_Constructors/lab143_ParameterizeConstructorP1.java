package Nov.ex_06112024_Constructors;

import java.util.Scanner;

public class lab143_ParameterizeConstructorP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dog d2 = new dog("kneww", 50);
        System.out.println("Hardcore age value printed: " + d2.age);
        System.out.println("Hardcore name value printed: " + d2.name);
        d2.display();

        System.out.print("Enter name: ");
        String name1 = sc.next();
        System.out.print("Enter age: ");
        int age1 = sc.nextInt();
        dog d3 = new dog(name1, age1);
        System.out.println("User input age: " + d3.age);
        System.out.println("User input name: " + d3.name);
        d3.display();
    }

}

class dog {
    String name;
    int age;

    dog(String name_1, int age_2) { //Parameterize Constructor
        this.name = name_1;
        this.age = age_2;
    }

    void display() {
        System.out.println("Name & Age prinetd through Behaviour method --->>" + this.name + " " + this.age);
    }
}
