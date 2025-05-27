package Nov.ex_07112024_Inharitance.singleinheritance.ex2;

public class Python extends Programming {

    void print (){  //Child Behaviour: no return type with no argument
        System.out.println(auth);
        System.out.println(version);
    }
    Python(){ //Child default constructor
        System.out.println("DC - Child");
    }
    public static void main(String[] args) { //Runner class
        Python p1 = new Python();
        System.out.println(p1.auth +" -> "+ p1.version);
        p1.print();
    }
}