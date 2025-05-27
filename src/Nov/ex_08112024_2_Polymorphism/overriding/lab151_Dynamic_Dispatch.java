package Nov.ex_08112024_2_Polymorphism.overriding;

public class lab151_Dynamic_Dispatch {
    public static void main(String[] args) {
        krishna k1 = new krishna();
        k1.home();

        //Dynamic Dispatch / Rutime Polymorphism >>>
        father f1 = new krishna();
        f1.home();
    }
}

class father{
    void home (){
        System.out.println("2BHK");
    }
}

class krishna extends father {
    @Override
    void home (){
        System.out.println("3BHK");
    }
}
