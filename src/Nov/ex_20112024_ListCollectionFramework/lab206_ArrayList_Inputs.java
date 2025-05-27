package Nov.ex_20112024_ListCollectionFramework;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class lab206_ArrayList_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> ages = new ArrayList<>();

        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter name: ");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter age: ");
            Integer Age = scanner.nextInt();
            ages.add(Age);

            scanner.nextLine();
            System.out.println("Y/N ? >> ");
            continueInput = scanner.nextLine();

        }
        System.out.println("Names > " + names);
        System.out.println("Ages > " + ages);

        //Output using for loop -->>
        for (Object o1: names){
            System.out.println(o1);
        }
        for (Object o2: ages){
            System.out.println(o2);
        }
        scanner.close();
    }
}
