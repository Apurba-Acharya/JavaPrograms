package Nov.ex_07112024_Inharitance.singleinheritance.ex1;

public class lab145_SI {
    public static void main(String[] args) {
        //Single Inharitance
        //Son will get the attributes from father
        //1 son 1 father

        Son s1 = new Son(); //Object 1
        System.out.println("Father attribute (Default constructor): " + s1.gold_f);       //son has extended father class
        s1.bhk3(); //Executing all behaviour coming under bhk3      //son has extended father class
        s1.bhk2(); // Executing all behaviour coming under bhk2     //son has extended father class

        Father f = new Father(20); //Object 2
        System.out.println(f.gold_f);
         f.bhk2(); //this is possible
         //f.bhk3(); // not posible because father has not extended
        }
    }