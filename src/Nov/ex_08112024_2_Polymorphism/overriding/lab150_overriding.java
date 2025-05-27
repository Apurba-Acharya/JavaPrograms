package Nov.ex_08112024_2_Polymorphism.overriding;

public class lab150_overriding {
    public static void main(String[] args) {
        hound h1 = new hound();
        h1.bark();
        System.out.println(h1.age);
    }
}


class dog { //SuperClass
    void bark(){  //Behaviour
        System.out.println("Dog can bark");
    }
    int age = 10; //Attribute
}

class hound extends dog{  //SubClass
   @Override
    void bark(){  //Behaviour
        System.out.println("Hound Can bark");
    }
    int age = 20;  //Attribute
}
