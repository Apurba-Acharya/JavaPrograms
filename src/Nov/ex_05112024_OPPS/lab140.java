package Nov.ex_05112024_OPPS;

public class lab140 {        //***This is call runner class
    public static void main(String[] args) {
        cat c1 = new cat(); //*** cat is getting called in the runner class
        c1.name = "Kalu";
        System.out.println(c1.name);
        c1.sleep();
    }
}

// C (class) = A(attribute) + B(Behaviour)
class cat{    // C (class)

    String name;   //A(attribute)

    void sleep(){  //B(Behaviour)
        System.out.println("sleeping ->> " + name);
    }
}
